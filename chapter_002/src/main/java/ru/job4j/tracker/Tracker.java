package ru.job4j.tracker;

import java.util.*;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    /**
     * Указатель на необходимость штатного завершения программы.
     */
    private boolean exited = true;

    public boolean isExited() {
        return exited;
    }

    public void setExited(boolean exited) {
        this.exited = exited;
    }

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        Random rm = new Random();
        return String.valueOf(rm.nextInt() + System.currentTimeMillis());
    }

    /**
     * Метод заменяет ячейку в массиве
     * @param id
     * @param item
     * @return Метод должен вернуть результат - удалось ли провести операцию
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        ListIterator<Item> iter = items.listIterator();
        while (iter.hasNext()) {
            if (iter.next().getId().equals(id)) {
                item.setId(id);
                iter.remove();
                iter.add(item);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаляет ячейку в массиве со сдвигом элементов правее ячейки на однин влево
     * @param id
     * @return Метод должен вернуть результат - удалось ли провести операцию
     */
    public boolean delete(String id) {
        boolean result = false;
        Iterator<Item> iter = items.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId().equals(id)) {
                iter.remove();
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     *  Метод возвращает копию массива items без null элементов
     * @return Метод должен вернуть копию массива items без null элементов
     */

    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Метод возвращает массив совпавших по параметру key элементов массива items
     * @param key
     * @return Возвращает массив совпавших по параметру key элементов массива items
     */

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item elem : items) {
            if (elem.getName().equals(key)) {
                result.add(elem);
            }
        }
        return result;
    }

    /**
     * Метод ищет в массиве items элемент по параметру id
     * @param id
     * @return Возвращает элемент массива items по параметру id или null если элемент не найден
     */
    public Item findById(String id) {
        Item result = null;
        for (Item elem : items) {
            if (elem.getId().equals(id)) {
                result = elem;
            }
        }
        return result;
    }
}
