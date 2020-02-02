package ru.job4j.opp.tracker;

import org.junit.Test;
import ru.job4j.oop.tracker.*;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answer = {"Fix PC"};
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.addNewItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item  = new Item("New item");
        tracker.add(item);
        String[] answers = {
                item.getId(), "Replace item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edit = tracker.findById(item.getId());
        assertThat(edit.getName(), is("Replace item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New item");
        tracker.add(item);
        String[] answers = {
                item.getId(), "Delete item"
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        assertThat(tracker.findById(answers[0]), is(nullValue()));
    }
}
