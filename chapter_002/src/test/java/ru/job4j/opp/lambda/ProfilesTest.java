package ru.job4j.opp.lambda;

import org.junit.Test;
import ru.job4j.oop.lambda.Address;
import ru.job4j.oop.lambda.Profile;
import ru.job4j.oop.lambda.Profiles;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    private Profiles profile = new Profiles();
    private List<Profile> list = Arrays.asList(
            new Profile(new Address("Minsk", "Proletarskaya", 43, 12)),
            new Profile(new Address("Serpuhov", "Mosvovskoe highway", 124, 25)),
            new Profile(new Address("Serpuhov", "Mosvovskoe highway", 124, 25)),
            new Profile(new Address("Moscow", "Pobedy", 62, 624)),
            new Profile(new Address("Moscow", "Pobedy", 62, 624)),
            new Profile(new Address("Chehov", "Pushkina", 33, 67)),
            new Profile(new Address("Chehov", "Pushkina", 33, 67))
    );

    @Test
    public void whenAdd() {
        List<Address> result = profile.collect(list);
        List<Address> expect = List.of(
                new Address("Minsk", "Proletarskaya", 43, 12),
                new Address("Serpuhov", "Mosvovskoe highway", 124, 25),
                new Address("Moscow", "Pobedy", 62, 624),
                new Address("Chehov", "Pushkina", 33, 67)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortedByCity() {
        List<Address> result = profile.collectSorted(list);
        List<Address> expect = List.of(
                new Address("Chehov", "Pushkina", 33, 67),
                new Address("Minsk", "Proletarskaya", 43, 12),
                new Address("Moscow", "Pobedy", 62, 624),
                new Address("Serpuhov", "Mosvovskoe highway", 124, 25)
        );
        assertThat(result, is(expect));
    }
}
