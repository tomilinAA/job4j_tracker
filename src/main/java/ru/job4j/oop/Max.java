package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;

    }

    public static int summation(int first, int second) {
        return first + second;
    }

    public static int summation(int first, int second, int third) {
        return summation(first, summation(second, third));
    }

    public static int summation(int first, int second, int third, int fourth) {
        return summation(first, summation(second, third, fourth));
    }

    public static void main(String[] args) {
        int check = Max.max(2, 1);
        System.out.println(check);
    }
}