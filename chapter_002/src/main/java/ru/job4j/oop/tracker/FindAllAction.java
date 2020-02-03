package ru.job4j.oop.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(item.getId() + " " + item.getName());
        }
        System.out.println();
        return true;
    }
}