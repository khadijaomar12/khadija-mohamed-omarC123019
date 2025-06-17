import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter the words");
        Scanner input =new Scanner(System.in);
        String words = input.next(); ;
        String reversed = "";

        for (int i = words.length() - 1; i >= 0; i--) {
            reversed += words.charAt(i);
        }

        if (words.equalsIgnoreCase(reversed)) {
            System.out.println(words + " is a Palindrome.");
        } else {
            System.out.println(words + " is not Palindrome.");
        }
    }
}
