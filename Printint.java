package Practicecodes.Java;

import java.util.Scanner;

public class Printint {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a integer");
            int num=scan.nextInt();
            System.out.println("The Number entered is "+num);
        }
    }
}
