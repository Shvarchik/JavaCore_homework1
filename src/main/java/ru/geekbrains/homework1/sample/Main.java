package ru.geekbrains.homework1.sample;

import ru.geekbrains.homework1.regular.Decorator;
import ru.geekbrains.homework1.regular.Point2D;

/**
 * javac -sourcepath ./java -d out java/ru/geekbrains/homework1/sample/Main.java
 * 
 * java -classpath ./out ru.geekbrains.homework1.sample.Main
 */

public class Main {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        Point2D b = new Point2D(2, 5);

        double dis = Point2D.distance(a, b);
        System.out.println(Decorator.decorate(dis));
    }
}
