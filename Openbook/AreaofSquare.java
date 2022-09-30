package Practicecodes.Java.Openbook;

import java.util.Scanner;

public class AreaofSquare {
    public static void main(String[] args) {
        System.out.println("Enter Side of Square:");
        try (Scanner scan = new Scanner(System.in)) {
            double side = scan.nextDouble(); 
            double area = side*side; 
            System.out.println("Area of Square is: "+area);
        }
    }
}
