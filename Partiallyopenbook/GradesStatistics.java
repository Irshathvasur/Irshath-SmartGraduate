package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        final int MAX_STUDENTS;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the maximum number of students");
        MAX_STUDENTS=scan.nextInt();
        int[] arr=new int[MAX_STUDENTS];
        double average;
        int temp=0,sum=0,maximum=0,minimum=100;//Minimum only works stable when we knew the maximum value it could get;
        for(int idx=0;idx<MAX_STUDENTS;idx++){
            System.out.println("Enter the mark of the student"+idx+1+":");
            temp=scan.nextInt();
            if(temp>maximum){
                maximum=temp;
            }
            if(temp<minimum){
                minimum=temp;
            }
            sum=sum+temp;
            arr[idx]=temp;
        }
        scan.close();
        average=(double)sum/MAX_STUDENTS;
        System.out.println("The Average of this marks is: "+average);
        System.out.println("The maximum of this marks is: "+maximum);
        System.out.println("The Minimum of this marks is: "+minimum);
    }
}
