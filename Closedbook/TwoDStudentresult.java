package Practicecodes.Java.Closedbook;

import java.util.Scanner;

public class TwoDStudentresult {
    public static void main(String[] args) {
        System.out.println("Enter the number of students");
        Scanner scan=new Scanner(System.in);
        final int MAX_STUD=scan.nextInt();
        int[][] arr=new int[MAX_STUD][5];
        for(int row=0;row<MAX_STUD;row++){
            System.out.println("Enter the 5 marks of the student"+(row+1));
            for(int col=0;col<5;col++){
                arr[row][col]=scan.nextInt();
            }
        }
        scan.close();
        int total[]=new int[5];
        for(int row=0;row<MAX_STUD;row++){
            for(int col=0;col<5;col++){
                total[row]=total[row]+arr[row][col];
            }
        }
        for(int row=0;row<MAX_STUD;row++){
            {
                System.out.println("The total marks of the student"+row+1+" is "+total[row]);
            }
        }
        
    }
}
