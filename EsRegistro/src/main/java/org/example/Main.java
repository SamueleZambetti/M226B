package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] names = {"Anna","Luca","Marco","Giulia","Sara","Paolo","Elena","Federico","Giorgia","Matteo"};
        String[] surnames = {"Rossi","Bianchi","Verdi","Neri","Ferrari","Romano","Galli","Costa","Greco","Moretti"};

        Random random = new Random();
        List<Student> students = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            double grade = 2 + random.nextInt(5);
            students.add(new Student(name, surname, grade));
        }

        GradeRegister register = new GradeRegister();
        ExecutorService pool = Executors.newFixedThreadPool(4);

        List<Callable<Void>> tasks = new ArrayList<>();
        for (Student s : students) {
            tasks.add(() -> {
                s.addNewGrade(register);
                return null;
            });
        }

        // submit and wait
        pool.invokeAll(tasks);
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Numero di voti inseriti: " + register.getCount());
        System.out.println("Somma voti: " + register.getSum());
        System.out.println("Media: " + register.average());
        System.out.println("Numero di 'Anna': " + register.getAnnaCount());
        System.out.println("Numero di cognome 'Rossi': " + register.getRossiCount());
    }
}
