package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Oct2Dec {
        public static void main(String[] args) {
            String str;
            System.out.println("Enter a Octadecimal string");
            Scanner scan=new Scanner(System.in);
            str=scan.next();
            scan.close();
            boolean isvalid=true;
            char ch;
            for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            if(!(ch<='7'&&ch>='0')){
                isvalid=false;
                break;
            }
            }
            if(isvalid){
            int decimal=Integer.parseInt(str, 8);
            System.out.println("The decimal value of the given string is "+decimal);
            }
            else
            System.out.println("Error:  invalid Octadecimal string "+str);
    }  
}
