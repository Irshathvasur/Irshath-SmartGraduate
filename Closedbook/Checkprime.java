package Practicecodes.Java.Closedbook;

import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args) {
        int temp=0;
        boolean isprime=true;
        System.out.println("Enter the number to be checked as prime");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++){
            temp=num%i;
            if(temp==0){
                isprime=false;
                break;
            }
        }
        if(isprime)
        System.out.println("The given number is Prime");
        else
        System.out.println("The given number is not prime");
    }
}
