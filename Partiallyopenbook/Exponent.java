package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        int exp; 
        int base; 
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the base:");
        base=scan.nextInt();
        System.out.print("Enter the exponent:");
        exp=scan.nextInt();
        scan.close();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp)); 
    }

    public static int exponent(int base,int exp){
        int product=1;
        for(int run=1;run<=exp;run++){
            product*=base;
        }
        return product;
    }
}
