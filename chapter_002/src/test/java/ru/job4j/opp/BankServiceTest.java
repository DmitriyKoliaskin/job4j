package ru.job4j.opp;

import org.junit.Test;
import ru.job4j.oop.bank.Account;
import ru.job4j.oop.bank.BankService;
import ru.job4j.oop.bank.User;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("4124", "Kolobok Kolobkov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("4124"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("3311", "Lisa Patrikevna");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("3124", 1000));
        assertThat(bank.findByRequisite("3311","3124").getBalance(), is(1000.0));
    }

    @Test
    public void transferMoney() {
        User user = new User("1253", "Volk Omnomnom");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5533", 2500));
        bank.addAccount(user.getPassport(), new Account("6633", 1000));
        bank.transferMoney(user.getPassport(), "5533", user.getPassport(), "6633", 500);
        assertThat(bank.findByRequisite("1253", "5533").getBalance(), is(2000.0));
        assertThat(bank.findByRequisite("1253", "6633").getBalance(), is(1500.0));
    }
}
