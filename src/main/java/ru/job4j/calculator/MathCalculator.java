package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumMinDel(double first, double second) {
        return min(first, second) + div(first, second);
    }

    public static double sumMax (double first, double second){
        return sum(first, second) + multiply(first, second) +
                min(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(50, 20));
        System.out.println("Результат расчета равен: " + sumMinDel(50, 20));
        System.out.println("Результат расчета равен: " + sumMax(50, 20));
    }
}
