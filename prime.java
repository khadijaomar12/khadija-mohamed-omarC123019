import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fadlan geli tiro: ");
        int number = input.nextInt();

        if (number == 2 || number == 3 || number == 5 || number == 7) {
            System.out.println(number + " waa Prime Number.");
        } else if (number < 2 || number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            System.out.println(number + " ma aha Prime Number.");
        } else {
            System.out.println(number + " waa Prime Number.");
        }

        input.close();

    }
}
