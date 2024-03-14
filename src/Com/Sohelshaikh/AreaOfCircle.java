package Com.Sohelshaikh;

import java.util.Scanner;
public class AreaOfCircle {
    // Java program to find area of circle

    public static void main(String[] args){

        // defining scanner class
        Scanner input = new Scanner(System.in);

        // taking user input
        System.out.println("Enter the radius of circle: ");
        double radius = input.nextDouble();
        double area;

        // calculate area
        area = Math.PI * radius * radius;

        // displaying result
        System.out.println("Area of circle for given output is: " + area);

    }
}
