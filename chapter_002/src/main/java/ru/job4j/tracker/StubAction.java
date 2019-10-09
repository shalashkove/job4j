package ru.job4j.tracker;

//public class StubAction implements UserAction {
public class StubAction extends BaseAction {
    private boolean call = false;

    public StubAction(int key, String name) {
        super(key, name);
    }

//    @Override
//    public String name() {
//        return "Stub action";
//    }
//
//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        call = true;
//        return false;
//    }

    @Override
    public void execute(Input input, Tracker tracker) {
        call = true;
        tracker.setExited(false);
    }

    public boolean isCall() {
        return call;
    }
}
