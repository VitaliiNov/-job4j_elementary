package ru.job4j.converterr;

public class Converterr {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 70; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converterr.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converterr.rubleToDollar(150);
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
