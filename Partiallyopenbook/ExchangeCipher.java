package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        String str;
        String exStr="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string to be exchanged");
        str=scan.next().toUpperCase();
        scan.close();
        char ch;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            exStr=exStr+((char)(('A'+'Z')-ch));
        }
        System.out.println("The exchanged text is "+exStr);
        }
}
