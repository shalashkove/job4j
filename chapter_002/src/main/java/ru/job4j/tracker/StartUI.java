package ru.job4j.tracker;

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
        Item[] items = tracker.findAll();
        for (int i = 0; i != items.length; i++) {
            System.out.println(String.format("Item № %d, id = %s, name = %s", i + 1,
                    items[i].getId(), items[i].getName()));
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
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(validate, tracker, actions);
    }
}
