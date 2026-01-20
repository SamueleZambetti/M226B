package org.example;

public class Student {
    private final String name;
    private final String surname;
    private final double grade;

    public Student(String name, String surname, double grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    public void addNewGrade(GradeRegister register) {
        register.addGrade(name, surname, grade);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGrade() {
        return grade;
    }
}
