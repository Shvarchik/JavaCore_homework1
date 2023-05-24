package ru.geekbrains.homework1.regular;

public class Decorator {
    public static String decorate(double n) {
        /*
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Here is your result: %6.2f", n);
    }
}
