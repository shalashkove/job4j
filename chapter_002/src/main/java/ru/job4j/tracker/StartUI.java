package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all Items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i != items.length; i++) {
                    System.out.println(String.format("Item № %d, id = %s, name = %s", i + 1,
                            items[i].getId(), items[i].getName()));
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                System.out.print("Enter Item id please: ");
                String id = scanner.nextLine();
                Item founded = tracker.findById(id);
                if (founded != null) {
                    System.out.println("Enter new name please: ");
                    String name = scanner.nextLine();
                    Item refreshed = new Item(name);
                    refreshed.setId(id);
                    boolean edited = tracker.replace(id, refreshed);
                    if (edited) {
                        System.out.println(String.format("Item with id = %s was successfully edit", id));
                        System.out.println(String.format("Item id = %s, name = %s",
                                refreshed.getId(), refreshed.getName()));
                    } else {
                        System.out.println(String.format("Item with id = %s was not edited", id));
                    }
                } else {
                    System.out.println(String.format("Item with id = %s is not exist", id));
                }

            } else if (select == 3) {
                System.out.println("=== Delete Item with id ====");
                System.out.print("Enter Item id please: ");
                String id = scanner.nextLine();
                boolean deleted = tracker.delete(id);
                if (deleted) {
                    System.out.println("Item was successfully deleted");
                } else {
                    System.out.println(String.format("Item with id = %s not found", id));
                }
            } else if (select == 4) {
                System.out.println("=== Find Item for id ====");
                System.out.print("Enter Item id please: ");
                String id = scanner.nextLine();
                Item founded = tracker.findById(id);
                if (founded != null) {
                    System.out.println(String.format("Item with id = %s was successfully found", id));
                    System.out.println(String.format("Item id = %s, name = %s", founded.getId(), founded.getName()));
                } else {
                    System.out.println(String.format("Item with id = %s was not found", id));
                }
            } else if (select == 5) {
                System.out.println("=== Find Item for name ====");
                System.out.print("Enter Item name please: ");
                String name = scanner.nextLine();
                Item[] founded = tracker.findByName(name);
                if (founded != null) {
                    System.out.println(String.format("Item('s) with name = %s was successfully found", name));
                    for (int i = 0; i != founded.length; i++) {
                        System.out.println(String.format("Item № %d, id = %s, name = %s", i + 1,
                                founded[i].getId(), founded[i].getName()));
                    }
                } else {
                    System.out.println(String.format("Item with name = %s was not found", name));
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("\nMenu.");
        // добавить остальные пункты меню.
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        //System.out.println("Select:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
