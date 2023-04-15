package ru.job4j.opp.tracker;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.oop.tracker.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.function.Consumer;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream stdout = new PrintStream(out);

    private final Consumer<String> output = stdout::println;



    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }


    @Test
    public void whenAddItem() {
        String[] answer = {"fix bug!"};
        Input input = new StubInput(answer);
        Tracker tracker = Tracker.getInstance();
        CreateAction createAction = new CreateAction();
        createAction.execute(input, tracker, output);
        Item created = tracker.findAll().get(0);
        assertThat(created.getName(), is("fix bug!"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = Tracker.getInstance();
        Item item  = new Item("New item");
        tracker.add(item);
        String[] answers = {
                item.getId(), "Replace item"
        };
        EditAction editAction = new EditAction();
        editAction.execute(new StubInput(answers), tracker, output);
        Item edit = tracker.findById(item.getId());
        assertThat(edit.getName(), is("Replace item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = Tracker.getInstance();
        Item item = new Item("New item");
        tracker.add(item);
        String[] answers = {
                item.getId(), "Delete item"
        };
        DeleteAction deleteAction = new DeleteAction();
        deleteAction.execute(new StubInput(answers), tracker, output);
        assertThat(tracker.findById(answers[0]), is(nullValue()));
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}

        );
        StubAction action = new StubAction();
        new StartUI(input, Tracker.getInstance(), System.out::println).init(new ArrayList<>(Collections.singletonList(action)));
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI(input, Tracker.getInstance(), System.out::println).init(new ArrayList<>(Collections.singletonList(action)));
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(out.toString(), is(expect));
        System.setOut(def);
    }
}
