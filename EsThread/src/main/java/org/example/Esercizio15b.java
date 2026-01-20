package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadLocalRandom;

public class Esercizio15b {
    public static void main(String[] args) {
        BankAccount accout = new BankAccount(1000);
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> accout.deposit(100));
            executor.submit(() -> accout.withdraw(100));
        }
        executor.shutdown();
        System.out.println("Saldo: " + accout.getBalance());
    }
}
