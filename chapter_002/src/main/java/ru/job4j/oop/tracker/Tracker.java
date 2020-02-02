package ru.job4j.oop.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указать ячейки для новой заявки.
     */

    private int position = 0;

    /**
     * Метод добавления зафки в хранилище
     *
     * @param item новая заявка
     */

    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для индефикации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод findByName проверяет в цикле все элементы массива this.items, сравнивая name c key. Все совпадающие элементы собирает в массив.
     *
     * @param key name, которое ищем среди массива объектов.
     * @return Массив, в который записаны все элементы с name key.
     */
    public Item[] findByName(String key) {
        Item[] itemsWithSameName = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(key)) {
                itemsWithSameName[size++] = items[index];
            }
        }
        itemsWithSameName = Arrays.copyOf(itemsWithSameName, size);
        return itemsWithSameName;
    }

    /**
     * Метод findById проверяет в цикле все элементы массива this.items, сравнивая id c id. И выдает этот элемент.
     *
     * @param id, которое ищем среди массива объектов.
     * @return Элемент, id которого совпадает с тем который мы ищем.
     */
    public Item findById(String id) {
        Item result = null;
        int index = indexOf(id);
        if (index != -1) {
            result = items[index];
        }
        return result;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
            return true;
        }
        return rsl;
    }


    public boolean delete(String id) {
        boolean rsl = false;
        int distPos = indexOf(id);
        if (distPos != -1) {
            int start = distPos + 1;
            int size = position - distPos;
            System.arraycopy(items, start, items, distPos, size);
            items[position] = null;
            position--;
            return true;
        }
        return rsl;
    }
}