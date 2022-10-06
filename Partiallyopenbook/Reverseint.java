package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Reverseint {
    public static void main(String[] args) {
        int number=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        number=scan.nextInt();
        scan.close();
        int num=number;
        int reverseint=0;
        while(num>0){
            reverseint=reverseint*10;
            reverseint=reverseint+num%10;
            num=num/10;
        }
        System.out.println("The reversed integer is "+reverseint);
    }
}
