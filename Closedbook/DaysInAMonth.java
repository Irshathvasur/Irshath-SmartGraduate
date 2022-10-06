package Practicecodes.Java.Closedbook;

import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        int month;
        System.out.println("Enter the number of the month to print its days");
        Scanner scan=new Scanner(System.in);
        month=scan.nextInt();
        switch(month){
            case 1:
            System.out.println("January has 31 days");
            break;
            case 2:
            System.out.println("Enter 1 if its leap year else enter -1");
                if(1==scan.nextInt()){
                    System.out.println("February in a leap year has 29 days");
                }
                else{
                    System.out.println("February in normal years has 28 days");
                }
            break;
            case 3:
            System.out.println("March has 31 days");
            break;
            case 4:
            System.out.println("April has 30 days");
            break;
            case 5:
            System.out.println("May has 31 days");
            break;
            case 6:
            System.out.println("June has 30 days");
            break;
            case 7:
            System.out.println("July has 31 days");
            break;
            case 8:
            System.out.println("August has 31 days");
            break;
            case 9:
            System.out.println("September has 30 days");
            break;
            case 10:
            System.out.println("October has 31 days");
            break;
            case 11:
            System.out.println("November has 30 days");
            break;
            case 12:
            System.out.println("December has 31 days");
            break;
            default:
            System.out.println("Try giving a Correct number of month");
        }
        scan.close();
    }
}
