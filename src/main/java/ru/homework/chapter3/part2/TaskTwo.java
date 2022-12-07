package ru.homework.chapter3.part2;

public class TaskTwo {

    public static String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >=0; i--) {
            res += i + " ";
        }
        return res;
    }
}
