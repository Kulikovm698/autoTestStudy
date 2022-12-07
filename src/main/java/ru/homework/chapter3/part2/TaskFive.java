package ru.homework.chapter3.part2;

public class TaskFive {

    public static int numLen(long x){
        int count = 0;
        for (; x!=0 ; x/=10) {
            count++;
        }
        return count;
    }

}
