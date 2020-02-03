package ru.job4j.oop.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] result = tracker.findByName(name);
        if (result.length > 0) {
            for (Item item : result) {
                System.out.println("Id: " + item.getId() + " Name: " + item.getName());
                System.out.println();
            }
        } else {
            System.out.println("Item not found, Try again.");
            System.out.println();
        }
        return true;
    }
}
