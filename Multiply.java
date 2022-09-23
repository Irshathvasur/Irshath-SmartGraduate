package Practicecodes.Java;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter value for i");
            int i=scan.nextInt();
            System.out.println("Enter value for j");
            int j=scan.nextInt();

            int k=i*j;
            System.out.println("The product of i and j is "+k);
        }
    }
}
