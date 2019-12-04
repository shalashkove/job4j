package ru.job4j.tracker;

import java.util.List;

//public class FindByNameAction implements UserAction {
public class FindByNameAction extends BaseAction {

    public FindByNameAction(int key, String name) {
        super(key, name);
    }

//    @Override
//    public String name() {
//        return "=== Find Item for name ====";
//    }
//
//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        String name = input.askStr("");
//        Item[] founded = tracker.findByName(name);
//        if (founded != null) {
//            for (int i = 0; i != founded.length; i++) {
//                System.out.println(String.format("%s %s", founded[i].getId(), founded[i].getName()));
//            }
//        } else {
//            System.out.println(String.format("Item with name = %s was not found", name));
//        }
//        return true;
//    }


    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.askStr("");
        List<Item> founded = tracker.findByName(name);
        if (founded != null) {
            for (Item elem : founded) {
                System.out.println(String.format("%s %s", elem.getId(), elem.getName()));
            }
        } else {
            System.out.println(String.format("Item with name = %s was not found", name));
        }
    }
}
