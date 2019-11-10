package ru.job4j.search;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
//        int i;
//        for (i = 0; i < tasks.size(); i++) {
//            if (task.getPriority() < tasks.get(i).getPriority()) {
//                break;
//            }
//        }
//        tasks.add(i, task);
        if (tasks.size() == 0) {
            tasks.add(task);
        } else {
            ListIterator<Task> iter = tasks.listIterator();
            while (iter.hasNext()) {
                Task elem = iter.next();
                if (task.getPriority() < elem.getPriority()) {
                    iter.previous();
                    iter.add(task);
                    break;
                }
            }
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
