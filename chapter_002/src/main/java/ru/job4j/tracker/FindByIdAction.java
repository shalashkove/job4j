package ru.job4j.tracker;

//public class FindByIdAction implements UserAction {
public class FindByIdAction extends BaseAction {

    public FindByIdAction(int key, String name) {
        super(key, name);
    }

//    @Override
//    public String name() {
//        return "=== Find Item for id ====";
//    }
//
//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        System.out.print("Enter Item id please: ");
//        String id = input.askStr("");
//        Item founded = tracker.findById(id);
//        if (founded != null) {
//            System.out.println(String.format("Item with id = %s was successfully found", id));
//            System.out.println(String.format("Item id = %s, name = %s", founded.getId(), founded.getName()));
//        } else {
//            System.out.println(String.format("Item with id = %s was not found", id));
//        }
//        return true;
//    }

    @Override
    public void execute(Input input, Tracker tracker) {
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
}
