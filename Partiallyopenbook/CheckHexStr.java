package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string to check whether it is hexadecimal or not");
        Scanner scan=new Scanner(System.in);
        str=scan.next();
        scan.close();
        char ch;
        boolean isvalid=true;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            if(!(ch<='9'&&ch>='0'||ch<='f'&&ch>='a'||ch<='F'&&ch>='A')){
                isvalid=false;
                break;
            }
        }
        if(isvalid){
            System.out.println("The given string is hexadecimal");
        }
        else
        System.out.println("The given string is not hexadecimal");
    }
}
