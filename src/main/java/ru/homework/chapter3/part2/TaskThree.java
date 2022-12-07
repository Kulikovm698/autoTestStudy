package ru.homework.chapter3.part2;

public class TaskThree {
    public static String chet(int x) {
        String res = "";
        for (int i = 0; i < x; i += 2) {
            res += i + " ";
        }
        return res;
    }
}
