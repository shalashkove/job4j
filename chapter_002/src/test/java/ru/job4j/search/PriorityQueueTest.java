package ru.job4j.search;

import org.junit.Test;

import java.util.Queue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenHigherPriorityOther() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("low-middle", 4));
        queue.put(new Task("middle", 3));
        queue.put(new Task("urgent-middle", 2));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("super-low", 8));
        var result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}