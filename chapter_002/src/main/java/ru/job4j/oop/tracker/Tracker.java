package ru.job4j.oop.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Tracker {

    private static Tracker instance = null;

    private Tracker() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    /**
     * Массив хранения заявок.
     */
    private final List<Item> items = new ArrayList<>();

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
        items.add(item);
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

    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Метод findByName проверяет в цикле все элементы массива this.items, сравнивая name c key. Все совпадающие элементы собирает в массив.
     *
     * @param key name, которое ищем среди массива объектов.
     * @return Массив, в который записаны все элементы с name key.
     */
    public List<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
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
            result = items.get(index);
        }
        return result;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < this.items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
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
            item.setId(items.get(index).getId());
            items.set(index, item);
            return true;
        }
        return rsl;
    }


    public boolean delete(String id) {
        boolean rsl = false;
        int distPos = indexOf(id);
        if (distPos != -1) {
            this.items.remove(distPos);
            return true;
        }
        return rsl;
    }
}