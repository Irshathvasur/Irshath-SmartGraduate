package Practicecodes.Java.Openbook;

import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 elements for the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        for(int num:arr){
            sum+=num;
        }
        System.out.println("The sum of the array is "+sum);
    }
}
