package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string without numbers");
        Scanner scan=new Scanner(System.in);
        str=scan.next().toLowerCase();
        scan.close();
        char ch;
        for(int get=0;get<str.length();get++){
            ch=str.charAt(get);
            switch(ch){
                case 'a':case 'b':case'c':
                    System.out.print(2);
                    break;
                case 'd':case 'e':case'f':
                    System.out.print(3);
                    break;
                case 'g':case 'h':case'i':
                    System.out.print(4);
                    break;
                case 'j':case 'k':case'l':
                    System.out.print(5);
                    break;
                case 'm':case 'n':case'o':
                    System.out.print(6);
                    break;
                case 'p':case 'q':case'r':case 's':
                    System.out.print(7);
                    break;
                case 'u':case 'v':case't':
                    System.out.print(8);
                    break;
                case 'x':case 'y':case'z':case 'w':
                    System.out.print(9);
                    break;
            }
        }
    }
}
