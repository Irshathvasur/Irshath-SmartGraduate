package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class TImetable {
    public static void main(String[] args) {
        int size;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the table");
        size=scan.nextInt();
        scan.close();
        System.out.print("\n   *|");
        for(int i=1;i<=size;i++){
            System.out.printf("%4d",i);
        }
        System.out.println();
        for(int i=1;i<=size;i++){
        System.out.print("-----");
        }
        System.out.println();
        for(int row=1;row<=size;row++){
            System.out.printf("%4d|",row);
            for(int col=1;col<=size;col++){
                System.out.printf("%4d",col*row);
            }
            System.out.println();
        }
    }
}
