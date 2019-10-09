package ru.job4j.tracker;

//public class ExitAction implements UserAction {
public class ExitAction extends BaseAction {

    public ExitAction(int key, String name) {
        super(key, name);
    }

//    @Override
//    public String name() {
//        return "=== Exit ====";
//    }

//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        return false;
//    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("Завершение программы");
        tracker.setExited(false);
    }
}
