package Practicecodes.Java.Openbook;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        int i=0,j=0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a value for i");
            i=scan.nextInt();
            System.out.println("Enter a value for j");
            j=scan.nextInt();
            int product=i*j;
            System.out.println("The product of the multipliers i and j is "+product);
        }
    }
}
