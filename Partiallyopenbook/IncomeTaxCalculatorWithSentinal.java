package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinal {
    public static void main(String[] args) {
        final int SENTINAL=-1;

        final double TAX_RATE_ABOVE_20K=0.1;
        final double TAX_RATE_ABOVE_40K=0.2;
        final double TAX_RATE_ABOVE_60K=0.3;

        int taxable_income;
        int rate;
        double tax_payable;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Taxable income ");
        taxable_income=scan.nextInt();

        while(taxable_income!=SENTINAL){
            if(taxable_income>60000){
                rate=taxable_income-60000;
                tax_payable=20000*TAX_RATE_ABOVE_20K+20000*TAX_RATE_ABOVE_40K+rate*TAX_RATE_ABOVE_60K;
            }
            else if(taxable_income>40000){
                rate=taxable_income-40000;
                tax_payable=20000*TAX_RATE_ABOVE_20K+rate*TAX_RATE_ABOVE_40K;
            }
            else if(taxable_income>20000){
                rate=taxable_income-20000;
                tax_payable=rate*TAX_RATE_ABOVE_20K;
            }
            else{
                tax_payable=0;
            }

            System.out.printf("The tax payable amount is $%.2f",tax_payable);

            System.out.print("\nEnter the taxable income (or enter -1 to exit) : $");
            taxable_income=scan.nextInt();

        }
        scan.close();
        System.out.println("Bye");
    }
}
