package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class CheckBinary {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string to check whether it is binary or not");
        Scanner scan=new Scanner(System.in);
        str=scan.next();
        scan.close();
        char ch;
        boolean isvalid=false;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            if(ch=='0'||ch=='1'){
                isvalid=true;
            }
            else{
            isvalid=false;
            break;
            }
        }
        if(str.length()>8){
            System.out.println("A binary can't be more than 8 values");
        }
        if(isvalid){
            System.out.printf("The given string %s is a valid Binary string",str);
        }
        else
        System.out.printf("The given string %s is not a binary string",str);
    }
}
