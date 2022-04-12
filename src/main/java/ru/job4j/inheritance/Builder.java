package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int iq;
    private String company;

    public Builder(String name, String surname, String education, String birthday, String exams, int iq) {
        super(name, surname, education, birthday, exams);
        this.iq = iq;
    }

    public Builder(int iq) {
        this.iq = iq;
    }

    public String getCompany() {
        return company;
    }
}

