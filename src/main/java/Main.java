import ru.job4j.calculator.ArgMethod;

public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int percent = 50;
        int salary = 120;
        int year = 0;
        while (0 < amount) {
            year++;
            amount = amount + (amount * percent / 100) - salary;
            System.out.println(year + " " + amount);
        }
    }
}
