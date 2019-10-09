package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    public Item[] getItems() {
        return items;
    }

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

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
        this.items[this.position++] = item;
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
        for (int i = 0; i != position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                item.setId(id);
                items[i] = item;
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
        for (int i = 0; i != position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, position - 1 - i);
                items[position - 1] = null;
                result = true;
                position--;
                break;
            }
        }
        return result;
    }

    /**
     *  Метод возвращает копию массива items без null элементов
     * @return Метод должен вернуть копию массива items без null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод возвращает массив совпавших по параметру key элементов массива items
     * @param key
     * @return Возвращает массив совпавших по параметру key элементов массива items
     */
    public Item[] findByName(String key) {
        Item[] tmp = new Item[position];
        int count = 0;
        for (int i = 0; i != position; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                tmp[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(tmp, count);
    }

    /**
     * Метод ищет в массиве items элемент по параметру id
     * @param id
     * @return Возвращает элемент массива items по параметру id или null если элемент не найден
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;
    }
}
