package ru.job4j.opp.lambda;

import org.junit.Test;
import ru.job4j.oop.lambda.Address;
import ru.job4j.oop.lambda.Profile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    private List<Profile> list = Arrays.asList(
            new Profile(new Address("Minsk", "Proletarskaya", 43, 12)),
            new Profile(new Address("Serpuhov", "Mosvovskoe highway", 124, 25)),
            new Profile(new Address("Moscow", "Pobedy", 62, 624)),
            new Profile(new Address("Chehov", "Pushkina", 33, 67))
    );

    @Test
    public void whenAdd() {
        List<Address> result = list.stream().map(Profile::getAddress).collect(Collectors.toList());
        List<Address> expect = List.of(
                new Address("Minsk", "Proletarskaya", 43, 12),
                new Address("Serpuhov", "Mosvovskoe highway", 124, 25),
                new Address("Moscow", "Pobedy", 62, 624),
                new Address("Chehov", "Pushkina", 33, 67)
        );
        assertThat(result, is(expect));
    }
}
