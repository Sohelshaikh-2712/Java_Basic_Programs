package Com.Sohelshaikh;

import java.util.Scanner;

public class OddEven {
    // Java program to find number is odd or even

        // main method
        public static void main(String[] args) {

            //Scanner class for taking input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Number");

            // evaluating expression and printing result
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("The Number" + num + " is even");
            } else {
                System.out.println("The Number " + num + " is odd");
            }

        }
    }

