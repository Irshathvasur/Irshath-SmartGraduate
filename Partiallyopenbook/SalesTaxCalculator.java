package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args){
        final int SENTINAL=-1;

        double price,actualprice,salestax;
        double total_price=0,total_actual_price=0,total_salestax=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the tax-inclusive price in dollars");
        price=scan.nextInt();

        while(price!=SENTINAL){
                actualprice=(double)price*((double)100/107);
                salestax=price-actualprice;
                total_price+=price;

                System.out.printf("Actual Price is: %.2f, Sales Tax is: %.2f",actualprice,salestax);

                System.out.println("\nEnter the tax-inclusive price in dollars (or -1 to end)");
                price=scan.nextInt();
        }    
        scan.close();
        total_actual_price=total_price*((double)100/107);
        total_salestax=total_price-total_actual_price;

        System.out.println("Total price is "+total_price);
        System.out.println("Total actual price is "+total_actual_price);
        System.out.println("Total sales tax "+total_salestax);
    }
}