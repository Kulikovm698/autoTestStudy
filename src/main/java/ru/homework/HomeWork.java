package ru.homework;

public class HomeWork {

    public static void main(String[] args) {

        System.out.println("Ответ на задание Часть 3 Задание 1: " + fraction(5.3));
        System.out.println("Ответ на задание Часть 3 Задание 2: " + sumLastNums(3454));
        System.out.println("Ответ на задание Часть 3 Задание 3: " + charToNum('5'));
        System.out.println("Ответ на задание Часть 3 Задание 4: " + isPositive(-9));
        System.out.println("Ответ на задание Часть 3 Задание 5: " + is2Digits(100));
        System.out.println("Ответ на задание Часть 3 Задание 6: " + isUpperCase('E'));
        System.out.println("Ответ на задание Часть 3 Задание 7: " + isInRange(4, 10, 5));
        System.out.println("Ответ на задание Часть 3 Задание 8: " + isDivisor(3, 6));
        System.out.println("Ответ на задание Часть 3 Задание 9: " + isEqual(4, 5, 4));
        System.out.println("Ответ на задание Часть 3 Задание 10: ");

        int[] arrs = new int[]{5, 11, 123, 14, 1};
        int tempSum = arrs[0];

        for (int i = 1; i <= arrs.length - 1; i++) {
            tempSum = +lastNumSum(tempSum, arrs[i]);
            System.out.println(tempSum);
        }
    }

    //Часть 3. Задание 1
    public static double fraction(double x) {
        double res = (int) x;
        double result = x - (int) x;
        return result;
    }

    //Часть 3. Задание 2
    public static int sumLastNums(int x) {
        int tempX = x;
        if (tempX < 10) {
            System.out.println("Число должно быть больше 10");
        }

        return tempX % 10 + (tempX / 10) % 10;
    }

    //Часть 3. Задание 3
    public static int charToNum(char x) {
        int i = x - '0';
        return i;
    }

    //Часть 3. Задание 4
    public static boolean isPositive(int x) {
        return x >= 0;
    }

    //Часть 3. Задание 5
    public static boolean is2Digits(int x) {
        return x > 9 && x <= 99;
    }

//    Часть 3. Задание 6

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    //    Часть 3. Задание 7
    public static boolean isInRange(int a, int b, int num) {
        if (a <= num && num <= b) {
            return true;
        } else {
            return false;
        }
    }

    //    Часть 3. Задание 8
    public static boolean isDivisor(int a, int b) {
        boolean isADivB = a % b == 0;
        boolean isBDivA = b % a == 0;
        return isADivB || isBDivA;
    }


    //    Часть 3. Задание 9
    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }


    // Часть 3. Задание 10
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }


}
