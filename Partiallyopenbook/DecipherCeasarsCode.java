package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class DecipherCeasarsCode {
    public static void main(String[] args) {
        String str,decipher="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Code to Decipher");
        str=scan.next().toUpperCase();
        scan.close();
        char ch;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            if(ch=='A'||ch=='B'||ch=='C'){
                decipher=decipher+((char)(ch+23));
            }
            else{
                decipher=decipher+((char)(ch-3));
            }
        }
        System.out.println("The Deciphered code is "+decipher);
    }
}
