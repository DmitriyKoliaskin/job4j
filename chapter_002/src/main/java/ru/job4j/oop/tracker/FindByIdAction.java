package ru.job4j.oop.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println("Id: " + result.getId() + " " + " Name: " + result.getName());
            System.out.println();
        } else {
            System.out.println("Item not found, Try again.");
            System.out.println();
        }
        return true;
    }
}
