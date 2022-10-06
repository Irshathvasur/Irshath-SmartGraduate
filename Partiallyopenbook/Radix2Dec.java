package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Radix2Dec {
    public static void main(String[] args) {
        String str;
        int radix;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a radix to work on");
        radix=scan.nextInt();
        System.out.println("Enter the string of radix:"+radix);
        str=scan.next();
        scan.close();
        boolean isvalid=true;
        char ch;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            if(radix==2){
                if(!(ch=='0'||ch=='1')){
                    isvalid=false;
                }
            }  
            else if(radix==16){
                if(!(ch<='9'&&ch>='0'||ch<='f'&&ch>='a'||ch<='F'&&ch>='A')){
                    isvalid=false;
                    break;
                }
            }    
            else{
                if(!(ch<='7'&&ch>='0')){
                    isvalid=false;
                    break;
                }
            }   
        }
        if(isvalid){
        int decimal=Integer.parseInt(str, radix);
        System.out.println("The decimal value of the given string is "+decimal);
        }
        else
        System.out.println("Error:  invalid Radix of "+radix+" string "+str);
    }    
}
