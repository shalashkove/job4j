package ru.job4j.tracker;

import java.util.List;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all Items ====");
        List<Item> items = tracker.findAll();
        int i = 0;
        for (Item elem : items) {
            System.out.println(String.format("Item № %d, id = %s, name = %s", i++,
                    elem.getId(), elem.getName()));
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Replace Item ====");
        System.out.print("Enter Item id please: ");
        String id = input.askStr("");
        Item founded = tracker.findById(id);
        if (founded != null) {
            System.out.println("Enter new name please: ");
            String name = input.askStr("");
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
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item with id ====");
        System.out.print("Enter Item id please: ");
        String id = input.askStr("");
        boolean deleted = tracker.delete(id);
        if (deleted) {
            System.out.println("Item was successfully deleted");
        } else {
            System.out.println(String.format("Item with id = %s not found", id));
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find Item for id ====");
        System.out.print("Enter Item id please: ");
        String id = input.askStr("");
        Item founded = tracker.findById(id);
        if (founded != null) {
            System.out.println(String.format("Item with id = %s was successfully found", id));
            System.out.println(String.format("Item id = %s, name = %s", founded.getId(), founded.getName()));
        } else {
            System.out.println(String.format("Item with id = %s was not found", id));
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find Item for name ====");
        System.out.print("Enter Item name please: ");
        String name = input.askStr("");
        List<Item> founded = tracker.findByName(name);
        if (founded != null) {
            System.out.println(String.format("Item('s) with name = %s was successfully found", name));
            int i = 0;
            for (Item elem : founded) {
                System.out.println(String.format("Item № %d, id = %s, name = %s", i++,
                        elem.getId(), elem.getName()));
            }
        } else {
            System.out.println(String.format("Item with name = %s was not found", name));
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            action.execute(input, tracker);
            run = tracker.isExited();
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (UserAction action : actions) {
            System.out.println(action.info());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new AddAction(0, "=== Create a new Item ==="),
                new FindAllAction(1, "=== Find all Items ==="),
                new ReplaceAction(2, "=== Replace Item ==="),
                new DeleteAction(3, "=== Delete Item with id ==="),
                new FindByIdAction(4, "=== Find Item for id ==="),
                new FindByNameAction(5, "=== Find Item for name ==="),
                new ExitAction(6, "=== Exit ===")
        };
        new StartUI().init(validate, tracker, actions);
    }
}
