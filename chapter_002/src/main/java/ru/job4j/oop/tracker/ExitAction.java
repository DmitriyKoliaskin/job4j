package ru.job4j.oop.tracker;

import java.util.function.Consumer;

public class ExitAction implements UserAction {
    public ExitAction() {
    }

    @Override
    public String name() {
        return "=== Exit ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("Счастья, здоровья!");
        return false;
    }
}
