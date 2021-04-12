package ru.job4j.opp.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import ru.job4j.oop.search.Person;
import ru.job4j.oop.search.PhoneDictionary;

import java.util.ArrayList;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Dmitriy", "Koliaskin", "124124", "Kapacevo")
        );
        ArrayList<Person> persons = phones.find("Dmitriy");
        assertThat(persons.get(0).getSurname(), is("Koliaskin"));
    }

    @Test
    public void whenFindByFall() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Dmitriy", "Koliaskin", "124124", "Kapacevo")
        );
        ArrayList<Person> persons = phones.find("Daf");
        assertTrue(persons.isEmpty());
    }
}
