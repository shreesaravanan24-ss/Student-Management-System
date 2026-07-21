package validation;

public class Validation {

    // Validate Name
    public static boolean isValidName(String name) {

        return name != null &&
                name.trim().length() >= 3 &&
                name.matches("[A-Za-z ]+");

    }

    // Validate Age
    public static boolean isValidAge(int age) {

        return age >= 17 && age <= 30;

    }

    // Validate Department
    public static boolean isValidDepartment(String department) {

        return department != null &&
                !department.trim().isEmpty();

    }

    // Validate Year
    public static boolean isValidYear(int year) {

        return year >= 1 && year <= 4;

    }

    // Validate Phone Number
    public static boolean isValidPhone(String phone) {

        return phone.matches("\\d{10}");

    }

    // Validate Email
    public static boolean isValidEmail(String email) {

        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    }

}