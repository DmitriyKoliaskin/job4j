package ru.job4j.opp.collection;

import org.junit.Test;
import ru.job4j.oop.collection.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Kolobok", 52));
        users.add(new User("Lisa", 25));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Kolobok", 52)));
        assertThat(it.next(), is(new User("Lisa", 25)));
    }

    @Test
    public void whenCompareLisaVSKolobok() {
        int rsl = new User("Kolobok", 52)
                .compareTo(
                        new User("Lisa", 25)
                );
        // Lisa лексический больше позначению чем Kolobok.
        assertThat(rsl, greaterThan(-2));
    }

    @Test
    public void whenCompareLisaVSLisa() {
        int rsl = new User("Lisa", 52)
                .compareTo(
                        new User("Lisa", 25)
                );
        // Lisa по возрасту старше другой Lis'ы.
        assertThat(rsl, greaterThan(0));
    }
}
