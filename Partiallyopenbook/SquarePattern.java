package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        int size;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the Square pattern");
        size=scan.nextInt();
        scan.close();
        for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
