package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double xdiff = Math.pow((x2 - x1), 2);
        double ydiff = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(xdiff + ydiff);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(5, 3, -3, 1);
        System.out.println("result2 (5, 3) to (-3, 1) " + result2);
        double result3 = Point.distance(154, -34, 0, 303);
        System.out.println("result3 (154, -34) to (0, 303) " + result3);
    }
}
