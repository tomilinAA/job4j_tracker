package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return  x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        int res = minus(y) + divide(y) + sum(y) + multiply(y);
        return res;
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(5);
        int resulMin = Calculator.minus(5);
        Calculator calculator = new Calculator();
        int resultMult = calculator.multiply(5);
        int resultDev = calculator.divide(5);
        int resultAll = calculator.sumAllOperation(5);
        System.out.println(resultAll);
    }
}
