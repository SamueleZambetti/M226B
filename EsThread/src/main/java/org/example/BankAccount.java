package org.example;

public class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Tentativo prelievo: " + amount + " fallito (saldo: " + balance + ")");
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}
