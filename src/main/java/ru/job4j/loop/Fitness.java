package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while ( ivan < nik)
            ivan *=3;
            month ++;
        System.out.println(month);
        return month;
    }
}
