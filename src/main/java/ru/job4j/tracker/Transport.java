package ru.job4j.tracker;

public interface Transport {
    void goStraight();

    void passengers(int pass);

    int price(int fuel);
}
