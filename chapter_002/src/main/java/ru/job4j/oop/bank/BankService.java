package ru.job4j.oop.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : this.users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = this.findByPassport(passport);
        if (user != null) {
            for (Account account : this.users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = this.findByRequisite(srcPassport, srcRequisite);
        Account destAcc = this.findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && srcAcc.getBalance() > amount) {
            if (destAcc != null) {
                srcAcc.setBalance(srcAcc.getBalance() - amount);
                destAcc.setBalance(destAcc.getBalance() + amount);
                return true;
            }
        }
        return rsl;
    }
}
