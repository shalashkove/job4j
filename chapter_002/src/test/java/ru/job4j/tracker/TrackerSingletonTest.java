package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TrackerSingletonTest {
    @Test
    public void whenEnumTrackerSingleton() {
        TrackerSingleton1 instance = TrackerSingleton1.INSTANCE;
        TrackerSingleton1 result = TrackerSingleton1.INSTANCE;
        assertThat(instance, is(result));
    }

    @Test
    public void whenStaticFieldTrackerSingleton() {
        TrackerSingleton2 instance = TrackerSingleton2.getInstance();
        TrackerSingleton2 result = TrackerSingleton2.getInstance();
        assertThat(instance, is(result));
    }

    @Test
    public void whenStaticFinalFieldTrackerSingleton() {
        TrackerSingleton3 instance = TrackerSingleton3.getInstance();
        TrackerSingleton3 result = TrackerSingleton3.getInstance();
        assertThat(instance, is(result));
    }

    @Test
    public void whenStaticFinalClassTrackerSingleton() {
        TrackerSingleton4 instance = TrackerSingleton4.getInstance();
        TrackerSingleton4 result = TrackerSingleton4.getInstance();
        assertThat(instance, is(result));
    }
}
