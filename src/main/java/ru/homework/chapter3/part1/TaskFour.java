package ru.homework.chapter3.part1;

public class TaskFour {

    public static String makeDecision(int x, int y) {

        if (x < y) {
            return x + "<" + y;
        } else if (x > y) {
            return x + ">" + y;
        }
        return x + "==" + y;
    }


}
