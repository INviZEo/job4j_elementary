package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double restAndTrust(double first, double second) {
        return divide(first, second)
                + minus(first, second);
    }

    public static double all(double first , double second) {
        return sum(first, second)
                + multiply(first, second)
                + divide(first, second)
                + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + restAndTrust(10, 20));
        System.out.println("Результат расчёта равен: " + all(10, 20));

    }
}