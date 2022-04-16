package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String it;

    public Programmer(String name, String surname, String education, String birthday, String exams, String it) {
        super(name, surname, education, birthday, exams, it);
        this.it = it;
    }
}