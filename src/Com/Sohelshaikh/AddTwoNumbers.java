package Com.Sohelshaikh;

import java.util.Scanner;

public class AddTwoNumbers {

        public static void main(String []args){
            // java program to add two numbers


            int num1 = 200;
            int num2 = 300;
            int result = num1 + num2;
            System.out.println("Total of two numbers is  = " + result);


            // add two number from user input

            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number :");
            int firstNum = input.nextInt();

            System.out.println("Enter second number");
            int secondNum = input.nextInt();

            int add = firstNum + secondNum;
            System.out.println("The sum of above two numbers is = " + add);

        }
    }


