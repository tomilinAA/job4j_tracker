package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String exams;
    private String experience;

    public Engineer(String name, String surname, String education, String birthday, String exams, String experience) {
        super(name, surname, education, birthday);
        this.exams = exams;
        this.experience = experience;
    }

    public String getExams() {
        return exams;
    }

    public String getExperience() {
        return experience;
    }
}


