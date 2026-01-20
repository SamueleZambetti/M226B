package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Esercizio15c {
    public static void main(String[] args) throws InterruptedException {
        AtomicBankAccount accout = new AtomicBankAccount(1000);
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> accout.deposit(100));
            executor.submit(() -> accout.withdraw(100));
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Saldo: " + accout.getBalance());
    }
}
