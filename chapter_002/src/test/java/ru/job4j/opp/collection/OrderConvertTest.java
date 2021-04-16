package ru.job4j.opp.collection;

import org.junit.Test;
import ru.job4j.oop.collection.Order;
import ru.job4j.oop.collection.OrderConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("14rfa", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("14rfa"), is(new Order("14rfa", "Dress")));
    }

    @Test
    public void whenDuplicateOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("14rfa", "Dress"));
        orders.add(new Order("14rfa", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("14rfa"), is(new Order("14rfa", "Dress")));
        assertThat(map.size(), is(1));
    }
}
