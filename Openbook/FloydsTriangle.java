package Practicecodes.Java.Openbook;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        int row,counter,j,number;
        number=1;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of rows ");
            row=scan.nextInt();
        }
        for(counter=1;counter<=row;counter++){
            for(j=1;j<=counter;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
