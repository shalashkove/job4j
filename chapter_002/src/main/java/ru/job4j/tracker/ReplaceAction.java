package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter id: ");
        String id = input.askStr("");
        Item founded = tracker.findById(id);
        if (founded != null) {
            System.out.print("Enter new name please: ");
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
        return true;
    }
}
