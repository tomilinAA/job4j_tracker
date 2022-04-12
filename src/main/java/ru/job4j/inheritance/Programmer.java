package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String it;
    private String iq;

    public Programmer(String name, String surname, String education, String birthday, String exams, String it, String iq) {
        super(name, surname, education, birthday, exams);
        this.it = it;
        this.iq = iq;
    }

    public Programmer(String it) {
        this.it = it;
    }

    public String getIq() {
        return iq;
    }
}
