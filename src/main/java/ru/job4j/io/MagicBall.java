package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        String str = new Scanner(System.in).nextLine();
        int random = new Random().nextInt(3);
        if (random == 0) {
            System.out.println("Да");
        } else if (random == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
