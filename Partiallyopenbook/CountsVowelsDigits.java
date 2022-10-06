package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class CountsVowelsDigits {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string");
        Scanner scan=new Scanner(System.in);
        str=scan.next().toLowerCase();
        scan.close();
        char ch;
        int vcount=0,dcount=0;
        for(int getter=0;getter<str.length();getter++){
            ch=str.charAt(getter);
            if(Character.isDigit(ch)){
                dcount++;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vcount++;
            }
        }
        double vpercentage=(double)((double)vcount/str.length())*100;
        double dpercentage=(double)((double)dcount/str.length())*100;
        System.out.printf("Number of vowels: %d (%.2f)",vcount,vpercentage);
        System.out.printf("\nNumber of digits: %d (%.2f)",dcount,dpercentage);
    }
}
