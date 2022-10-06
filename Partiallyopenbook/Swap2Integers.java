package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        num1=scan.nextInt();
        System.out.print("Enter the 2nd number : ");
        num2=scan.nextInt();
        scan.close();
        //Swapping starts here
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("\nThe new 1st number is "+num1);
        System.out.println("The new 2nd number is "+num2);
    }
}
