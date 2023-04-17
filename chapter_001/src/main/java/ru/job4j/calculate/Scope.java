package ru.job4j.calculate;

public class Scope {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println(" x и y: " + x + " " + y);
            /** y = 100;  Ошибка! переменная y недоступна
             /* в этой области действия, тогда как
             /* переменная x доступна здесь
             */
            System.out.println(" x равно " + x);
        }
    }
}
