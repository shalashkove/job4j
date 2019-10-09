package ru.job4j.tracker;

class AddAction extends BaseAction {

    public AddAction(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name:");
        String desc = input.askStr("Enter description:");
        tracker.add(new Item(name, desc));
    }
}
