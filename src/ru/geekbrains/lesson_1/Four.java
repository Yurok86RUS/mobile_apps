package ru.geekbrains.lesson_1;

public class Four {
    public static void main(String[] args) {
        boolean res = checkSum(5,1);
    System.out.println(res);
    }

    static boolean checkSum(double x, double y){
        double sum = x + y;
    if (sum>=10 && sum<=20)
        return true;
    else return false;
    }

}
