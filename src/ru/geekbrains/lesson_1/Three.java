package ru.geekbrains.lesson_1;

public class Three {
    public static void main(String[] args) {

        double result = calc();
        System.out.println(result);
    }

    static double calc(){
        double a = 1;
        double b = 2;
        double c = 3;
        double d = 4;
        return a * (b+(c/d));
    }
}
