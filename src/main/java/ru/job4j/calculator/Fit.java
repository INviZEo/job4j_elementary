package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = 185 - 100 * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = 160 - 110 * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 185;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 185 is" + man);
        System.out.println("Woman 160 is " + woman);
    }
}



