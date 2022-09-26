package Practicecodes.Java.Assignment1java;

import java.util.Scanner;

public class Rectanglecomputation {
    public static void main(String[] args) {
        double height,width,area,perimeter;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the height and width of the rectangle");
            height=scan.nextInt();
            width=scan.nextInt();
            area=height*width;
            perimeter=2*(height+width);
            System.out.println("The Area of the given rectangle is "+area);
            System.out.println("The perimeter of the given rectangle is "+perimeter);
        }
    }
}
