package ru.job4j.opp.collection;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import ru.job4j.oop.tracker.Item;
import ru.job4j.oop.tracker.SortItemDecrease;
import ru.job4j.oop.tracker.SortItemIncrease;

public class SortItemTest {

    Item item1 = new Item("Aeboy");
    Item item2 = new Item("Kolobok");
    Item item3 = new Item("Lisa");

    List<Item> list = Arrays.asList(item2, item1, item3);

    public void setID() {
        item1.setId("1");
        item2.setId("2");
        item3.setId("3");
    }

    @Test
    public void whenCompareThenDown() {
        this.setID();
        Collections.sort(list, new SortItemDecrease());
        assertThat(list, is(List.of(item3, item2, item1)));
    }
    @Test
    public void whenCompareThenRise() {
        this.setID();
        Collections.sort(list,new SortItemIncrease());
        assertThat(list, is(List.of(item1, item2, item3)));
    }
}
