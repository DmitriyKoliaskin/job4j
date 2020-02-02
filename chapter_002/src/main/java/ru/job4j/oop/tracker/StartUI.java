package ru.job4j.oop.tracker;

public class StartUI {
    private Input input;
    private Tracker tracker;

    public static void addNewItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Executed item: " + item.getName());
        System.out.println();
    }

    public static void showAllItem(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        System.out.println("All items: ");
        for (Item item : result) {
            System.out.println(item.getId() + " " + item.getName());
        }
        System.out.println();
    }

    public static void editItem(Input input, Tracker tracker) {
            System.out.println("=== Edit item===");
            String id = input.askStr("Enter Id: ");
            String newName = input.askStr("Enter new name: ");
            Item item = new Item(newName);
            boolean result = tracker.replace(id, item);
            if (result) {
                System.out.println("Item " + id + " changed.");
                System.out.println();
            } else {
                System.out.println("Item :" + id + " not found.");
            }
    }

    public static void deleteItem(Input input, Tracker tracker) {
            System.out.println("=== Edit item===");
            String id = input.askStr("Enter Id: ");
            boolean result = tracker.delete(id);
            if (!result) {
                System.out.println("Deletion not executed, Try again.");
                System.out.println();
            }
    }

    public static void findItemId(Input input, Tracker tracker) {
            System.out.println("=== Find item by Id===");
            String id = input.askStr("Enter Id: ");
            Item result = tracker.findById(id);
            if (result != null) {
                System.out.println("Id: " + tracker.findById(id).getId() + " " + " Name: " + tracker.findById(id).getName());
                System.out.println();

            } else {
                System.out.println("Item not found, Try again.");
                System.out.println();
            }
    }

    public static void findItemName(Input input, Tracker tracker) {
            System.out.println("=== Find item by name===");
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
    }

    public static void exitProgram() {
        System.out.println("Счастья, здоровья!");
        System.out.println();
    }


    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askInt("Select: "));
            if (select == 0) {
                StartUI.addNewItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemId(input, tracker);
            } else if (select == 5) {
                StartUI.findItemName(input, tracker);
            } else if (select == 6) {
                StartUI.exitProgram();
                run = false;
            } else {
                System.out.println();
                System.out.println("Select a menu item from 0 to 6.");
                System.out.println();
            }
        }
    }

        private void showMenu() {
            System.out.println("Menu:");
            System.out.println();
            System.out.println("0. Add new item.");
            System.out.println("1. Show all items.");
            System.out.println("2. Edit item.");
            System.out.println("3. Delete item.");
            System.out.println("4. Find item by Id.");
            System.out.println("5. Find item by name.");
            System.out.println("6. Exit Program.");
        }

    public static void main(String[]args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}