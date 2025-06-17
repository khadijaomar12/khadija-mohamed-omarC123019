import java.util.Scanner;
public class charactar_N {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int count = 1;
            String controller;
            System.out.println("Enter numbers to add");
            System.out.println("---------------------------------------------");

            System.out.println("Enter number "+count+" or press n to stop");
            controller = input.next();

            while (!controller.equalsIgnoreCase("n")) {
                count++;
                int number = Integer.parseInt(controller); // convert to int
                sum += number;

                System.out.println("Enter number "+count+ " or press n to stop: ");
                controller = input.next();
            }

            System.out.println("The total sum is: " + sum);
        }

}
