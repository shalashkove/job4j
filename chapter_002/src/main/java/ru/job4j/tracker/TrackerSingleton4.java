package ru.job4j.tracker;

/**
 * 4. private static final class. Lazy loading.
 */
public class TrackerSingleton4 {

    private TrackerSingleton4() {
    }

    public static TrackerSingleton4 getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingleton4 INSTANCE = new TrackerSingleton4();
    }
}
