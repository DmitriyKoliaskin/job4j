package ru.job4j.opp.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.oop.tracker.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream stdout = new PrintStream(out);

    private final Consumer<String> output = new Consumer<>() {

        @Override
        public void accept(String s) {
        }
    };

        @Before
    public void loadOutput() {
        output.accept("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        output.accept("execute after method");
    }

    @Test
    public void whenCheckOutput() {
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindByNameAction act = new FindByNameAction();
        act.execute(new StubInput(new String[] {item.getName()}), tracker, System.out::println);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getId() + " " + item.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(stdout);
    }
}
