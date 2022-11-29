package ru.homework;

public class HomeWork {

    public static void main(String[] args) {

        System.out.println("Ответ на задание Часть 3 Задание 1: " + fraction(5.3));

        System.out.println("Ответ на задание Часть 3 Задание 3: " + charToNum('5'));
        System.out.println("Ответ на задание Часть 3 Задание 4: " + isPositive(-5));
        System.out.println("Ответ на задание Часть 3 Задание 5: " + is2Digits(10));
//        System.out.println("Ответ на задание: Часть 3 Задание 6: " + isUpperCase("DSDSDSDSD"));

    }

    //Часть 3. Задание 1
    public static double fraction(double x) {
        double res = (int) x;
        double result = x - (int) x;
        return result;
    }

    //Часть 3. Задание 2


    //Часть 3. Задание 3
    public static int charToNum(char x) {
        int i = x - '0';
        return i;
    }

    //Часть 3. Задание 4
    public static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //Часть 3. Задание 5
    public static boolean is2Digits(int x) {
        if (x > 9 && x <= 99) {
            return true;
        } else {
            return false;
        }
    }

//    Часть 3. Задание 6

//    public static boolean isUpperCase(char x) {
//        if (x.equals(x.toLowerCase()))
//            return true;
//        return false;
//    }

//    Часть 
}
