package Com.Sohelshaikh;

import java.util.Scanner;

public class ArmstrongNumber {
    // Java Program to find the number is armstrong or not
        /*
        Armstrong Number in Java: A positive number is called Armstrong number if it is
        equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407, etc.
         */

    // defining main method
    public static void main(String[] args){

        // Creating Scanner Class
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter 3 digit number: ");
        int num = input.nextInt();

        // evaluating expression
        for(int number = num; number != 0; number /= 10) {
            int temp = number % 10;
            total += temp * temp * temp;
        }

        if (total == num) {
            System.out.println("" + num + " is armstrong number");
        } else {
            System.out.println("" + num + " is not armstrong number");
        }






    }
}
