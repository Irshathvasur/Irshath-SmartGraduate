package Practicecodes.Java.Closedbook;

import java.util.Scanner;

public class Average {
    float average(int[] arr,int n){
        float a=0;
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        a=sum/n;
        return a;
    }
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of integers you are going to enter");
        n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the set");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        Average obj=new Average();
        System.out.println("Average of the set is "+obj.average(arr,n));
    }
}
