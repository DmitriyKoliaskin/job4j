package ru.job4j.opp.tracker;

import org.junit.Test;

import ru.job4j.oop.tracker.FindByNameAction;
import ru.job4j.oop.tracker.Item;
import ru.job4j.oop.tracker.StubInput;
import ru.job4j.oop.tracker.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream stdout = new PrintStream(out);
    private final Consumer<String> output = stdout::println;

    @Test
    public void whenCheckOutput() {
       Tracker tracker = Tracker.getInstance();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindByNameAction act = new FindByNameAction();
        act.execute(new StubInput(new String[] {item.getName()}), tracker, output);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getId() + " " + item.getName())
                .toString();
        assertThat(out.toString(), is(expect));
        System.setOut(stdout);
    }
}
