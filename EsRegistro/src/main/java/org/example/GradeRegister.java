package org.example;

public class GradeRegister {
    private double sum;
    private int count;
    private int annaCount;
    private int rossiCount;

    public GradeRegister() {
        this.sum = 0.0;
        this.count = 0;
        this.annaCount = 0;
        this.rossiCount = 0;
    }

    public synchronized void addGrade(String name, String surname, double grade) {
        this.sum += grade;
        this.count++;
        if ("Anna".equals(name)) {
            this.annaCount++;
        }
        if ("Rossi".equals(surname)) {
            this.rossiCount++;
        }
    }

    public synchronized double average() {
        return count == 0 ? 0.0 : sum / count;
    }

    public synchronized int getCount() {
        return count;
    }

    public synchronized double getSum() {
        return sum;
    }

    public synchronized int getAnnaCount() {
        return annaCount;
    }

    public synchronized int getRossiCount() {
        return rossiCount;
    }
}
