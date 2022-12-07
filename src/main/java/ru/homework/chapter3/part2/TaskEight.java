package ru.homework.chapter3.part2;

public class TaskEight {

    public static void triangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = i; j!=0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

