package ru.job4j.loop;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("infinity");
            index = index - 1; //Эта строка вызывает бесконечный цикл, потому что условие цикла будет всегда верным, переменная index будет принимать значение 0 либо -1 и не дойдёт до 10//
        }
    }
}