package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteThenMinusItem() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        Item test4 = new Item("test4");
        Item test5 = new Item("test5");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(test4);
        tracker.add(test5);
        //System.out.println(Arrays.toString(tracker.getItems()));
        int befor = tracker.findAll().size();
        boolean result = tracker.delete(test5.getId());
        int after = tracker.findAll().size();
        //System.out.println(Arrays.toString(tracker.getItems()));
        assertThat(result, is(result && (befor - after == 1)));
    }

    @Test
    public void whenFindAllThenResult() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        Item test4 = new Item("test4");
        Item test5 = new Item("test5");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(test4);
        tracker.add(test5);
        List<Item> result = tracker.findAll();
        assertThat(result.size(), is(5));
    }

    @Test
    public void whenFindByNameThenResult() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test2");
        Item test4 = new Item("test2");
        Item test5 = new Item("test5");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(test4);
        tracker.add(test5);
        List<Item> result = tracker.findByName("test2");
        assertThat(result.size(), is(3));
    }

    @Test
    public void whenFindByIdThenItem() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        Item test4 = new Item("test4");
        Item test5 = new Item("test5");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(test4);
        tracker.add(test5);
        Item result = tracker.findById(test5.getId());
        assertThat(result, is(test5));
    }

    @Test
    public void whenFindByIdInEmptyItems() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item expect = null;
        Item result = tracker.findById(test1.getId());
        assertThat(result, is(expect));
    }
}
