package ru.job4j.oop.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String newName = input.askStr("Enter new name: ");
        Item item = new Item(newName);
        if (tracker.replace(id, item)) {
            System.out.println("Item :" + id + " changed.");
            System.out.println();
        } else {
            System.out.println("Item :" + id + " not found.");
            System.out.println();
        }
        return true;
    }
}
