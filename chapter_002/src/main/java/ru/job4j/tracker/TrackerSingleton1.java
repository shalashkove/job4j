package ru.job4j.tracker;

/**
 * 1. enum. Eager loading.
 */
public enum TrackerSingleton1 {
    INSTANCE(new Tracker());

    private Tracker instance;

    TrackerSingleton1(Tracker tracker) {
        instance = tracker;
    }
}
