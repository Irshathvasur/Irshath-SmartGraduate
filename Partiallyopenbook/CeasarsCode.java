package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class CeasarsCode {
    public static void main(String[] args) {
        String str,cipher="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        str=scan.next().toUpperCase();
        scan.close();
        char ch;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            if(ch=='X'||ch=='Y'||ch=='Z'){
                cipher=cipher+((char)(ch-23));
            }
            else{
                cipher=cipher+((char)(ch+3));
            }
        }
        System.out.println("The ciphered code is "+cipher);
    }
}
