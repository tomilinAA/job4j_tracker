package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String money;

    public Surgeon(String name, String surname, String education, String birthday, String mag, String money) {
        super(name, surname, education, birthday, mag);
        this.money = money;
    }

    public Surgeon(String money) {
        this.money = money;
    }

    public String getMoney() {
        return money;
    }
}
