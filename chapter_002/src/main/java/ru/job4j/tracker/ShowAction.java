package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i != items.length; i++) {
            System.out.println(String.format("Item № %d, id = %s, name = %s", i + 1,
                    items[i].getId(), items[i].getName()));
        }
        return true;
    }
}
