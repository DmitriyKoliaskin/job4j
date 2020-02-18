package ru.job4j.oop.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            if (!map.containsKey(order.getNumber())) {
                map.put(order.getNumber(), order);
            }
        }
        return map;
    }
}