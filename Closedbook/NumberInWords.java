package Practicecodes.Java.Closedbook;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        scan.close();
        int SepNum;
        int temp=0;
        while(num>0){
            temp+=num%10;
            temp*=10;
            num=num/10;
        }
        while(temp>0){
            SepNum=temp%10;
            temp=temp/10;
            switch(SepNum){
                case 1:
                System.out.print("One ");
                break;
                case 2:
                System.out.print("Two ");
                break;
                case 3:
                System.out.print("Three ");
                break;
                case 4:
                System.out.print("Four ");
                break;
                case 5:
                System.out.print("Five ");
                break;
                case 6:
                System.out.print("Six ");
                break;
                case 7:
                System.out.print("Seven ");
                break;
                case 8:
                System.out.print("Eight ");
                break;
                case 9:
                System.out.print("Nine ");
                break;
            }
        }
    }
}
