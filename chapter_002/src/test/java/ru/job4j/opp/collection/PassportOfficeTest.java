package ru.job4j.opp.collection;

import org.junit.Test;
import ru.job4j.oop.collection.Citizen;
import ru.job4j.oop.collection.PassportOffice;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {
    @Test

    public void add() {
        Citizen citizen = new Citizen("312sd", "Kolobok Kolobkov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}
