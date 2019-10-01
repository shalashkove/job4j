package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item with id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter id: ");
        String id = input.askStr("");
        boolean deleted = tracker.delete(id);
        if (deleted) {
            System.out.println("Item was successfully deleted");
        } else {
            System.out.println(String.format("Item with id = %s not found", id));
        }
        return true;
    }
}
