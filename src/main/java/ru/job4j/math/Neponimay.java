package ru.job4j.math;

import ru.job4j.math.MathFunction;

public class Neponimay {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(104, 20));
    }
}

