package Com.Sohelshaikh;
import java.util.Scanner;
public class PositiveNegative {
    // Java program to find weather a number is positive or negative

    // main method
        public static void main(String[] args) {

            // Scanner class
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number");
            int num = input.nextInt();

            // evaluating expression and printing result
            if (num < 0) {
                System.out.println("" + num + " is negative number");
            } else {
                System.out.println("" + num + " is positive number");
            }

        }
    }

