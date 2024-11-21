package com.example.lab8;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        boolean hasNumber= false;
        boolean isMoreThan10 = false;

        if (password.length() >=10) isMoreThan10 = true;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasNumber = true;
        }

        if (hasUpperCase && hasLowerCase && hasNumber && isMoreThan10) return true;
        return false;
    }
}