package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String pacient;
    private String diagnosisHeal;

    public Doctor(String name, String surname, String education, String birthday, String pacient) {
        super(name, surname, education, birthday);
        this.pacient = pacient;
    }

    public String diagnosisHeal() {
        return diagnosisHeal;
    }
}
