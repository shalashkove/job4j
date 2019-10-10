package ru.job4j.tracker;

/**
 * 2. static field. Lazy loading.
 */
public class TrackerSingleton2 {
    private static TrackerSingleton2 instance;

    private TrackerSingleton2() {
    }

    public static TrackerSingleton2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingleton2();
        }
        return instance;
    }
}
