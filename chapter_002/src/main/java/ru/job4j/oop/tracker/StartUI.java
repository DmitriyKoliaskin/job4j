package ru.job4j.oop.tracker;

import java.util.Scanner;

public class StartUI {
    private Scanner scanner;
    private Tracker tracker;

    StartUI(Scanner scanner, Tracker tracker) {
        this.tracker = tracker;
        this.scanner = scanner;
    }

    public void addNewItem() {
        System.out.println("=== Create a new Item ===");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Executed item: " + item.getName());
        System.out.println();
    }

    public void showAllItem() {
        Item[] result = tracker.findAll();
        System.out.println("All items: ");
        for (Item item : result) {
            System.out.println(item.getId() + " " + item.getName());
        }
        System.out.println();
    }

    public void editItem() {
            System.out.println("=== Edit item===");
            System.out.println("Enter Id: ");
            String id = scanner.nextLine();
            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();
            Item item = new Item(newName);
            boolean result = tracker.replace(id, item);
            if (result) {
                System.out.println("Item " + id + " changed.");
                System.out.println();
            } else {
                System.out.println("Item :" + id + " not found.");
            }
    }

    public void deleteItem() {
            System.out.println("=== Edit item===");
            System.out.println("Enter Id: ");
            String id = scanner.nextLine();
            boolean result = tracker.delete(id);
            if (!result) {
                System.out.println("Deletion not executed, Try again.");
                System.out.println();
            }

    }

    public void findItemId() {
            System.out.println("=== Find item by Id===");
            System.out.println("Enter Id: ");
            String id = scanner.nextLine();
            Item result = tracker.findById(id);
            if (result != null) {
                System.out.println("Id: " + tracker.findById(id).getId() + " " + " Name: " +
                        tracker.findById(id).getName());
                System.out.println();

            } else {
                System.out.println("Item not found, Try again.");
                System.out.println();
            }
    }

    public void findItemName() {
            System.out.println("=== Find item by name===");
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
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

    public void exitProgram() {
        System.out.println("Счастья, здоровья!");
        System.out.println();
    }


    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                addNewItem();
            } else if (select == 1) {
                showAllItem();
            } else if (select == 2) {
                editItem();
            } else if (select == 3) {
                deleteItem();
            } else if (select == 4) {
                findItemId();
            } else if (select == 5) {
                findItemName();
            } else if (select == 6) {
                exitProgram();
                run = false;
            } else {
                System.out.println();
                System.out.println("Select a menu item from 0 to 6.");
                System.out.println();
            }
        }
    }

        private void showMenu () {
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

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI(scanner, tracker).init(scanner, tracker);
    }
}