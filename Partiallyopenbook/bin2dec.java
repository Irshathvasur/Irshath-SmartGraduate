package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class bin2dec {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a binary string");
        Scanner scan=new Scanner(System.in);
        str=scan.next();
        scan.close();
        boolean isvalid=false;
        char ch;
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
        if(isvalid){
        int decimal=Integer.parseInt(str, 2);
        System.out.println("The decimal value of the given string is "+decimal);
        }
        else
        System.out.println("Error:  invalid binary string "+str);
    }
}
