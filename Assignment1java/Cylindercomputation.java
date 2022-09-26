package Practicecodes.Java.Assignment1java;

import java.util.Scanner;

public class Cylindercomputation {
    public static void main(String[] args) {
        double radius,height,surface_area,base_area,volume,pi=3.14;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the radius and height of the cylinder ");
            radius=scan.nextInt();
            height=scan.nextInt();
        }
        surface_area=2*(pi*radius*height)+2*(pi*(radius*radius));
        base_area=pi*(radius*radius);
        volume=pi*(radius*radius)*height;
        System.out.println("The Surface area of the given cylinder is "+surface_area);
        System.out.println("The Base area of the given cylinder is "+base_area);
        System.out.println("The Volume of the given cylinder is "+volume);
    }
}
