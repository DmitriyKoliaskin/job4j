package ru.job4j.oop.tracker;

import java.util.function.Consumer;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker, Consumer<String> output);
}
