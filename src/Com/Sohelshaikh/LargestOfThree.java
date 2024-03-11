package Com.Sohelshaikh;

import java.util.Scanner;

public class LargestOfThree {
        // Java program to find largest among three numbers
        /* This java program takes 3 integer values from use as input,
         and prints the largest number among them.
          */

    // defining main method
        public static void main(String[] args) {

            // Creating Scanner class for taking user input
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the first number");
            int num1 = input.nextInt();

            System.out.println("Enter the second number");
            int num2 = input.nextInt();

            System.out.println("Enter the third number");
            int num3 = input.nextInt();

            // Calculating the expression and printing the result
            if (num1 > num2 && num1 > num3) {
                System.out.println("First number " + num1 + " is largest");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("Second number " + num2 + " is largest");
            } else {
                System.out.println("Third number " + num3 + " is largest");
            }

        }
    }
