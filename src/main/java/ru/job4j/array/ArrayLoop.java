package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] count = new int[5];
        for (int i = 0; i < count.length; i++) {
            count[i] = i * 2 + 3;
            System.out.println(count[i]);
        }
    }
}

