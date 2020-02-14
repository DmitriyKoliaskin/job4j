package ru.job4j.oop.tracker;

import java.util.Comparator;

public class SortItemDecrease implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getId().compareTo(first.getId());
    }
}
