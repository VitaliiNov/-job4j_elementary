package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (code == 36 || code == 95) {
                valid = false;
                break;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valid = true;
        for (int i = 65; i < 95; i++) {
            if (code == 36 || code == 95) {
                valid = false;
                break;
            }
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = true;
        for (int i = 65; i < 91; i++) {

            if (code < 65 || code > 96) {
                valid = false;
                break;
            }
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        return false;
    }
}

