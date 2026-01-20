package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Esercizio15a {
    private static void simulateBigFileDownload() {
        System.out.println("Inizio download grande file...");
        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Download interrotto.");
        }
        System.out.println("Download completato!");
    }

    private static void timeCounter(){
        for(int i = 1; i <= 6; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Contatore interrotto.");
            }
            System.out.println("Secondi trascorsi: " + i);
        }
    }

    public static void main(String[] args){
        System.out.println("SEQUENZIALE");
        simulateBigFileDownload();
        timeCounter();

        System.out.println("SEPARATI");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> simulateBigFileDownload());
        executor.submit(Esercizio15a::timeCounter);
        executor.shutdown();
    }
}
