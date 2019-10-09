package ru.job4j.tracker;

//public class FindAllAction implements UserAction {
public class FindAllAction extends BaseAction {

    public FindAllAction(int key, String name) {
        super(key, name);
    }

//    @Override
//    public String name() {
//        return "Find all.";
//    }
//
//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        for (Item item : tracker.findAll()) {
//            System.out.println(String.format("%s %s", item.getId(), item.getName()));
//        }
//        return true;
//    }


    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
    }
}
