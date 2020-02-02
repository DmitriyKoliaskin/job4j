package ru.job4j.oop.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Счастья, здоровья!");
        return false;
    }
}
