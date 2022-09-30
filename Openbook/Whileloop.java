package Practicecodes.Java.Openbook;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        int num,sum=0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number not more than 10");
            num=scan.nextInt();
        }
        while(num<=10){
            sum=sum+num;
            num++;
        }
        System.out.printf("The sum of the numbers from the while loop is %d",sum);
    }
}
