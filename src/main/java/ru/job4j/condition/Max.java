package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = first > max(second, third) ? first : max(second, third);
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = first > max(second, third, fourth) ? first : max(second, third, fourth);
        return result;
    }

}
