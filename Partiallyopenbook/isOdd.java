package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class isOdd {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=scan.nextInt();
        scan.close();
        if(isodd(num))
            System.out.println(num+" is a odd number");
        else{
            System.out.println(num+" is even number");
        }
    }
    static boolean isodd(int num){
        boolean bool=true;
        if(num%2==0){
            bool=false;
        }
        return bool;
    }
}
