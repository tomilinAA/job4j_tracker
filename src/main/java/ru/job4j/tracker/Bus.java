package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public void goStraight() {
        System.out.println("Прямо");
    }

    @Override
    public void passengers(int pass) {
        System.out.println(pass);
    }

    @Override
    public int price(int fuel) {
        return fuel * 5;
    }
}
