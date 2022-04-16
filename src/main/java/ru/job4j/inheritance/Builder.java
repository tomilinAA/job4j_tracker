package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int iq;
    private String company;

    public Builder(String name, String surname, String education, String birthday, String exams, String company) {
        super(name, surname, education, birthday, exams, company);
        this.iq = iq;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}

