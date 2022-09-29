package Practicecodes.Java.Openbook;

import java.util.Scanner;

public class PrintANumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int number=scan.nextInt();
            System.out.println("The number you entered is "+number);
        }
    }
}
