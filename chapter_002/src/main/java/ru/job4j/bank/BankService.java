package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (list.indexOf(account) < 0) {
                list.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream().filter(x -> x.getPassport().equals(passport)).findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = this.findByPassport(passport);
        return user != null
                ? users.get(user).stream().filter(x -> x.getRequisite().equals(requisite))
                .findFirst().orElse(null)
                : null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Account destAccount = this.findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }
}