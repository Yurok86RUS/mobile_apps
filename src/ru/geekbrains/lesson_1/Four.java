package ru.geekbrains.lesson_1;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите первый аргумент: ");
        double x = input.nextDouble();
        System.out.println("Введите второй аргумент: ");
        double y = input.nextDouble();

        boolean res = checkSum(x,y);
    System.out.println(res);
    }

    static boolean checkSum(double x, double y){
        double sum = x + y;
    if (sum>=10 && sum<=20)
        return true;
    else return false;
    }

}
