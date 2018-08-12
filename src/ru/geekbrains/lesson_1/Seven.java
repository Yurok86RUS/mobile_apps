package ru.geekbrains.lesson_1;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
    System.out.println("Привет, "+nameUser());
    }

    static String nameUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Как тебя зовут? ");
        String name = input.nextLine();
        return name;
    }
}
