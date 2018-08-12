package ru.geekbrains.lesson_1;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число ");
        int argum = input.nextInt();
        boolean check = checkArg(argum);
        if (check == true)
            System.out.println("Передано положительное число");
        else System.out.println("Передано отрицательное число");
    }
        static boolean checkArg(int argum){
            if (argum>=0)
                return true;
            else return false;
        }


}
