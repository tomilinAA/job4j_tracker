package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String exams;
    private String experience;

    public Engineer(String name, String surname, String education, String birthday, String exams) {
        super(name, surname, education, birthday);
        this.exams = exams;
    }

    public Engineer(String exams) {
        this.exams = exams;
    }

    public Engineer() {

    }

    public String getExams() {
        return exams;
    }

    public String getExperience() {
        return experience;
    }
}


