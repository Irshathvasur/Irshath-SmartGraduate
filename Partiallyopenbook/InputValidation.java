package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int num=0;
        boolean isvalid=false;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Enter a number between 0 to 10 or 90 to 100");
            num=scan.nextInt();
            if((num>=0&&num<=10||num>=90&&num<=100)){
                isvalid=true;
            }
            else{
                System.out.println("Enter a valid input");
            }
        }while(!isvalid);
        scan.close();
        System.out.println("You entered "+num);
    }
}
