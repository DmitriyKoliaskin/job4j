package ru.job4j.oop.tracker;

import java.util.Comparator;

public class SortItemIncrease implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getId().compareTo(second.getId());
    }
}
