package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int num1,num2,num3;
        int min,max;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three numbers to find product, sum, minimum and max of those");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        scan.close();
        int sum=num1+num2+num3;
        int product=num1*num2*num3;
        min=num1;
        if(min>num2){
            min=num2;
        }
        if(min>num3){
            min=num3;
        }
        max=num1;
        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }
        System.out.println("The Sum of the 3 is "+sum);
        System.out.println("The product of this 3 is "+product);
        System.out.println("The minimum of this numbers is "+min);
        System.out.println("The maximum of this numbers is "+max);
    }
}
