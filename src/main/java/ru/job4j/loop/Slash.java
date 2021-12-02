package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {

                boolean left = cell == row;
                boolean right = cell + row == size && cell != row;
                if (right) {
                    System.out.println("0");
                } else if (left) {
                    System.out.println("0");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}