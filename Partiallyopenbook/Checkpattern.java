package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Checkpattern {
    public static void main(String[] args) {
        int size;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the Check pattern");
        size=scan.nextInt();
        scan.close();
        for(int row=0;row<size;row++){
            if(row%2!=0){
                System.out.print(" ");
            }
            for(int col=0;col<size;col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
