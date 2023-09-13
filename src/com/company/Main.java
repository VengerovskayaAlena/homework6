package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println(" Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    System.out.println(" Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

    System.out.println(" Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

    System.out.println(" Задача 4");
        for (int i = -10; i <= 10; i++) {
            System.out.println(i);
        }

    System.out.println(" Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

    System.out.println(" Задача 6");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }

    System.out.println(" Задача 7");
        for (int i = 1; i < 1000; i = i*2) {
            System.out.println(i);
        }

    System.out.println(" Задача 8");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

    System.out.println(" Задача 9");
        int savings9 = 29000;
        int total9 = 0;
        for (int i = 1; i <= 12; i++) {
            total9 = total9 + total9/100;
            total9 = total9 + savings9;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total9 + " рублей");
        }

    System.out.println(" Задача 10");
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            a = 2 * i;
            System.out.println("2*" + i + "=" + a);
        }
    }
}
