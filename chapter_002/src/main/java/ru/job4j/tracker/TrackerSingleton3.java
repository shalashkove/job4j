package ru.job4j.tracker;

/**
 * 3. static final field. Eager loading.
 */
public class TrackerSingleton3 {
    private static final TrackerSingleton3 INSTANCE = new TrackerSingleton3();

    private TrackerSingleton3() {
    }

    public static TrackerSingleton3 getInstance() {
        return INSTANCE;
    }
}
