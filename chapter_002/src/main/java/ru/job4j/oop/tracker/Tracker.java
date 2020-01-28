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
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод findAll возвращает копию массива this.items без null элементов
     * @return Массив без null елементов.
     */
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName() != null) {
                itemsWithoutNull[size++] = items[index];
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    /**
     * Метод findByName проверяет в цикле все элементы массива this.items, сравнивая name c key. Все совпадающие элементы собирает в массив.
     * @param key name, которое ищем среди массива объектов.
     * @return Массив, в который записаны все элементы с name key.
     */
    public Item[] findByName(String key) {
        Item[] itemsWithSameName = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName() != null && items[index].getName().equals(key)) {
                itemsWithSameName[size++] = items[index];
            }
        }
        itemsWithSameName = Arrays.copyOf(itemsWithSameName, size);
        return itemsWithSameName;
    }

    /**
     * Метод findById проверяет в цикле все элементы массива this.items, сравнивая id c id. И выдает этот элемент.
     * @return Элемент, id которого совпадает с тем который мы ищем.
     * @param id, которое ищем среди массива объектов.
     */
    public Item findById(String id) {
        return items[indexOf(id)];
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


    public Item replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(items[index].getId());
        this.items[index] = item;
        return item;
    }
}