package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class HextoDec {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a Hexadecimal string");
        Scanner scan=new Scanner(System.in);
        str=scan.next();
        scan.close();
        boolean isvalid=true;
        char ch;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            if(!(ch<='9'&&ch>='0'||ch<='f'&&ch>='a'||ch<='F'&&ch>='A')){
                isvalid=false;
                break;
            }
        }
        if(isvalid){
        int decimal=Integer.parseInt(str, 16);
        System.out.println("The decimal value of the given string is "+decimal);
        }
        else
        System.out.println("Error:  invalid Hexadecimal string "+str);
    }
}

