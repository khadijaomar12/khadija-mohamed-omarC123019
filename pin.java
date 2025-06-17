import java.util.Scanner;
public class pin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (isValidLength(password) && hasUpperCase(password) && hasLowerCase(password)
                    && hasDigit(password) && hasSpecialChar(password)) {
                System.out.println("Password is strong!");
            } else {
                System.out.println("Password does not meet the strength requirements.");
            }
        }
        public static boolean isValidLength(String password) {
            return password.length() >= 8;
        }
        public static boolean hasUpperCase(String password) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) return true;
            }
            return false;
        }
        public static boolean hasLowerCase(String password) {
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) return true;
            }
            return false;
        }
        public static boolean hasDigit(String password) {
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) return true;
            }
            return false;
        }
        public static boolean hasSpecialChar(String password) {
            String specialChars = "!@#$%^&*()-_=+[{]};:'\",<.>/?";
            for (char c : password.toCharArray()) {
                if (specialChars.contains(String.valueOf(c))) return true;
            }
            return false;
        }
    }

