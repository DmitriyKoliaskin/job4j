package ru.job4j.opp.collection;

import org.junit.Test;
import ru.job4j.oop.collection.Account;
import ru.job4j.oop.collection.NotifyAccount;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("412", "Kolobok Kolobkov", "asf213sa"),
                new Account("451", "Lisa Patrikevna", "0000012")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("412", "Kolobok Kolobkov", "asf213sa"),
                        new Account("451", "Lisa Patrikevna", "0000012")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void deleteDuplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("412", "Kolobok Kolobkov", "asf213sa"),
                new Account("412", "Kolobok Kolobkov", "asf213sa"),
                new Account("451", "Lisa Patrikevna", "0000012"),
                new Account("451", "Lisa Patrikevna", "0000012")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("412", "Kolobok Kolobkov", "asf213sa"),
                        new Account("451", "Lisa Patrikevna", "0000012")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
