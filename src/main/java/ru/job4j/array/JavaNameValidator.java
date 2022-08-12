package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean res = false;
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                if (isUpperLatinLetter(name.charAt(i)) || Character.isDigit(name.charAt(i))) {
                    return false;
                }
            } else {
                if (isUpperLatinLetter(name.charAt(i))
                        || isLowerLatinLetter(name.charAt(i))
                        || isSpecialSymbol(name.codePointAt(i))
                        || Character.isDigit(name.charAt(i))) {
                    res = true;
                }
            }
        }
        return res;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
