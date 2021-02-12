package ru.job4j.opp.tracker;


import org.junit.Test;
import ru.job4j.oop.tracker.Item;
import ru.job4j.oop.tracker.Tracker;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = Tracker.getInstance();
        Item item = new Item("test1");
        tracker.add(item);
        List<Item> result = tracker.findByName(item.getName());
        assertThat(result.get(0).getName(), is(item.getName()));
    }
    @Test
    public void checkHowFindAllWork() {
        Tracker tracker = Tracker.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item2);
        tracker.add(item1);
        List<Item> exp = tracker.findAll();
        assertThat(exp.size(), is(5));
    }

    @Test
    public void checkHowFindByName() {
        Tracker tracker = Tracker.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        ArrayList<Item> expect = new ArrayList<>();
        expect.add(item2);
        assertThat(tracker.findByName("test2"), is(expect));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = Tracker.getInstance();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = Tracker.getInstance();
        Item bug = new Item("Bug");
        Item bug2 = new Item("Bug2");
        tracker.add(bug);
        tracker.add(bug2);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}