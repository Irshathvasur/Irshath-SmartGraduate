package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

class ReverseString{
    public static void main(String[] args) {
        String inStr="";
        String RevStr="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        inStr=scan.next();
        scan.close();
        for(int getter=inStr.length()-1;getter>=0;getter--){
            RevStr=RevStr+inStr.charAt(getter);
        }
        System.out.println("The reversed string is "+RevStr);
    }
}