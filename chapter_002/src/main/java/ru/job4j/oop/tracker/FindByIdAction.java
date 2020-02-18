package ru.job4j.oop.tracker;

import java.util.function.Consumer;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Enter id: ");
        Item result = tracker.findById(id);
        if (result != null) {
            output.accept("Id: " + result.getId() + " " + " Name: " + result.getName());
        } else {
            output.accept("Item not found, Try again.");
        }
        return true;
    }
}
