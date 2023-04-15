package ru.job4j.opp.tracker;


import org.junit.Test;
import ru.job4j.oop.tracker.Item;
import ru.job4j.oop.tracker.Tracker;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    Tracker tracker = Tracker.getInstance();
    Item item1 = new Item("test1");
    Item item2 = new Item("test2");
    Item item3 = new Item("test3");
    Item bug1 = new Item("Bug");
    Item bug2 = new Item("Bug2");

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(bug1);
        tracker.add(bug2);
        List<Item> result = tracker.findByName(item1.getName());
        assertThat(result.get(0).getName(), is(item1.getName()));
    }
    @Test
    public void checkHowFindAllWork() {
        List<Item> exp = tracker.findAll();
        assertThat(exp.size(), is(9));
    }

    @Test
    public void checkHowFindByName() {
        List<Item> result = tracker.findByName(item1.getName());
        assertThat(result.get(0).getName(), is("test1"));
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
        String id = bug2.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}