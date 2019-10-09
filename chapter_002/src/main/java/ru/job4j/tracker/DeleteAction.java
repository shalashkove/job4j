package ru.job4j.tracker;

//public class DeleteAction implements UserAction {
public class DeleteAction extends BaseAction {
//    @Override
//    public String name() {
//        return "=== Delete Item with id ====";
//    }
    public DeleteAction(int key, String name) {
        super(key, name);
    }

    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        System.out.print("Enter id: ");
//        String id = input.askStr("");
//        boolean deleted = tracker.delete(id);
//        if (deleted) {
//            System.out.println("Item was successfully deleted");
//        } else {
//            System.out.println(String.format("Item with id = %s not found", id));
//        }
//        return true;
//    }
    public void execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean deleted = tracker.delete(id);
        if (deleted) {
            System.out.println("Item was successfully deleted");
        } else {
            System.out.println(String.format("Item with id = %s not found", id));
        }
    }
}
