package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean a = (ab + ac) > bc;
        boolean b = (ac + bc) > ab;
        boolean c = (ab + bc) > ac;
        return a && b && c;
    }
}