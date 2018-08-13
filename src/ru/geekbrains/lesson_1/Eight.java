package ru.geekbrains.lesson_1;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = input.nextInt();

        boolean check = visoYear(year);
        if (check == true)
            System.out.println("Введенный год является високосным");
        else System.out.println("Введенный год не является високосным");

    }

    static boolean visoYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0 ))
            return true;
        else return false;
    }
}
