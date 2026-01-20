package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicBankAccount {
    private AtomicInteger balance;

    public AtomicBankAccount(int initial) {
        this.balance = new AtomicInteger(initial);
    }

    public void deposit(int amount) {
        balance.addAndGet(amount);
    }

    public boolean withdraw(int amount) {
        if (amount <= balance.get()) {
            balance.addAndGet(-amount);
            return true;
        } else {
            System.out.println("Tentativo prelievo: " + amount + " fallito (saldo: " + balance + ")");
            return false;
        }
    }

    public int getBalance() {
        return balance.get();
    }
}
