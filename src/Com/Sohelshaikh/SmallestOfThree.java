package Com.Sohelshaikh;
import java.util.Scanner;
public class SmallestOfThree {
    // Java program to find Smallest number among three numbers

// main method
        public static void main(String[] args) {

            //Scanner class & taking user input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            System.out.println("Enter third number");
            int num3 = input.nextInt();

            // evaluating expression and printing result
            if (num1 < num2 && num1 < num3) {
                System.out.println("First number " + num1 + " is smallest");
            } else if (num2 < num1 && num2 < num3) {
                System.out.println("Second Number " + num2 + " is smallest");
            } else {
                System.out.println("Third number " + num3 + " is smallest");
            }

        }
    }
