package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the first integer");
            int num1=scan.nextInt();
            System.out.println("Enter the second integer");
            int num2=scan.nextInt();
            int sum=num1+num2;
            System.out.println("The sum is "+sum);
        }
    }
}
