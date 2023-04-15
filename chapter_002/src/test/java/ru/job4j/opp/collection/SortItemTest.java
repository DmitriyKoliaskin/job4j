package ru.job4j.opp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import ru.job4j.oop.tracker.Item;
import ru.job4j.oop.tracker.SortItemDecrease;
import ru.job4j.oop.tracker.SortItemIncrease;

public class SortItemTest {

    public List<Item> createdListItem() {
        Item item1 = new Item("Aeboy");
        Item item2 = new Item("Kolobok");
        Item item3 = new Item("Lisa");

        return Arrays.asList(item1, item2, item3);
    }

    public void setID(List<Item> list) {
        list.get(0).setId("1");
        list.get(1).setId("2");
        list.get(2).setId("3");
    }

    @Test
    public void whenCompareThenDown() {
        List<Item> list = createdListItem();
        setID(list);
        list.sort(new SortItemDecrease());
        ArrayList<String> copy = new ArrayList<>();
        for (Item item : list) {
            copy.add(item.getName());
        }
        assertThat(copy, is(List.of("Lisa", "Kolobok", "Aeboy")));
    }
    @Test
    public void whenCompareThenRise() {
        List<Item> list = createdListItem();
        setID(list);
        list.sort(new SortItemIncrease());
        ArrayList<String> copy = new ArrayList<>();
        for (Item item : list) {
            copy.add(item.getName());
        }
        assertThat(copy, is(List.of("Aeboy", "Kolobok", "Lisa")));
    }
}
