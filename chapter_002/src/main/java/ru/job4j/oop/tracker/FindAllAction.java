package ru.job4j.oop.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindAllAction implements UserAction {

    private final Consumer<String> output = System.out::println;

    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        List<Item> result = tracker.findAll();
        for (Item item : result) {
            output.accept(item.getId() + " " + item.getName());
        }
        return true;
    }
}
