package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double w = Math.sqrt(16);
        return w;
    }

    public static void main(String[] args) {
        double w = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + w);
    }
}
