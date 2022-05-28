package com.example.main3;

public class Main3 {
    public static void main(String[] args) {
        // Переменные
        int balance = 300;
        int payment = 1250;
        int bonus = 0;
        // Логика
        if (payment > 1000) {
            bonus = payment / 100;
            System.out.println("Вы пополнили счёт на " + payment + " руб. и получаете бонус в " + bonus + " руб.");
        } else {
            System.out.println("Вы пополнили счёт на " + payment + " руб. Внесите более 1000 руб. для получения бонуса.");
        }
        int total = balance + payment + bonus;
        System.out.println("Ваш баланс: " + total + " руб.");
    }

}
