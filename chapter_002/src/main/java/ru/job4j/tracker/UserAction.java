package ru.job4j.tracker;

//public interface UserAction {
//    String name();
//
//    boolean execute(Input input, Tracker tracker);
//}

public interface UserAction {
    int key();

    void execute(Input input, Tracker tracker);

    String info();
}