package ru.homework.chapter3.part1;

public class TaskFive {

    public static int max3(int x, int y, int z) {

        if (x > y && x > z) {
             return x;
        } else if (y > z) return y;
        return z;
    }


}
