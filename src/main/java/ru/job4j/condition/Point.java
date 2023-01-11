package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

    public static void main(String[] args) {
        double result = Point.distance(-8, 10, 10, 10);
        System.out.println("result (12, 5) to (2, 8) " + result);
    }
}
