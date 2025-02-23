package java2.projects.b.utils;

public class InputValidator {

    // Validates that a double is positive
    public static boolean isPositive(double amount) {
        return amount > 0;
    }

    // Validates that a string is not null or empty
    public static boolean isNonEmptyString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    // Validates account number format (example: only numeric and 10 characters long)
    public static boolean isValidAccountNumber(String accountNumber) {
        return accountNumber != null && accountNumber.matches("\\d{10}");
    }

    // Validates account holder name (example: only letters and spaces, non-empty)
    public static boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z\\s]+");
    }
}

