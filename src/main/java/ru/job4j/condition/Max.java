package ru.job4j.condition;

public class Max  {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static double max(double left, double right, double forward) {
        return left > right ? left : right;
    }

        public static int max(int left, int right, int forward) {
            if (left > right && left > forward) {
                return left;
            } else if (right > left && right > forward) {
                return right;
            } else {
                return forward;
            }
        }

    public static int max(int black, int left, int right, int forward) {
        if (left > right && left > forward) {
            return left;
        } else if (right > left && right > forward) {
            return right;
        } else {
            return forward;
        }
    }

        public static int max(byte left, byte right, byte forward, byte black) {
            if (left > right && left > forward) {
                return left;
            } else if (right > left && right > forward) {
                return right;
            } else {
                return forward;
            }
    }

    public static void main(String[] args) {
        double x = max(8, 5, 10);
        System.out.println(x);
    }
}
