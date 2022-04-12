package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String isNotRussianDantist;

    public Dentist(String name, String surname, String education, String birthday, String mag, String isNotRussianDantist) {
        super(name, surname, education, birthday, mag);
        this.isNotRussianDantist = isNotRussianDantist;
    }

    public Dentist(String isNotRussianDantist) {
        this.isNotRussianDantist = isNotRussianDantist;
    }
}
