package ru.job4j.oop.tracker;

import java.util.function.Consumer;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            output.accept("Item deleted");
        } else {
            output.accept("Invalid item id");
        }
        return true;
    }
}
