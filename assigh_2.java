import java.util.Scanner;
public class assigh_2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter password: ");
            String pass = input.nextLine();

            if (checkLength(pass) && hasUpper(pass) && hasLower(pass) && hasDigit(pass) && hasSpecial(pass)) {
                System.out.println("Strong password");
            } else {
                System.out.println("Weak password");
            }
        }

        public static boolean checkLength(String pass) {
            return pass.length() >= 8;
        }

        public static boolean hasUpper(String pass) {
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isUpperCase(pass.charAt(i))) return true;
            }
            return false;
        }

        public static boolean hasLower(String pass) {
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isLowerCase(pass.charAt(i))) return true;
            }
            return false;
        }

        public static boolean hasDigit(String pass) {
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i))) return true;
            }
            return false;
        }

        public static boolean hasSpecial(String pass) {
            String specials = "!@#$%^&*";
            for (int i = 0; i < pass.length(); i++) {
                if (specials.indexOf(pass.charAt(i)) != -1) return true;
            }
            return false;
        }
    }

