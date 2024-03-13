package Com.Sohelshaikh;
import java.util.Scanner;
public class SwapNumbers {
    // Java program to swap two numbers

    // Main method
        public static void main(String[] args) {

            // Scanner class & user input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = input.nextInt();
            System.out.println("Enter second number");
            int num2 = input.nextInt();

            // printing values before swapping
            System.out.println("----- Before Swapping-----");
            System.out.println("First number = " + num1);
            System.out.println("Second number = " + num2);

            // printing values after swapping
            System.out.println("----- After Swapping -----");
            System.out.println("First number = " + num2);
            System.out.println("Second number = " + num1);
        }
    }


