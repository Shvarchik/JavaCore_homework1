package ru.geekbrains.homework1.regular;

/**
 * Точка 2D c координатами x, y
 */
public class Point2D {
    private int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод возвращает расстояние между двумя точками 2D на плоскости
     * 
     * @param a Точка а
     * @param b Точка b
     * @return
     */
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
