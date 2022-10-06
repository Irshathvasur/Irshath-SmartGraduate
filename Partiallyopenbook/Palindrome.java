package Practicecodes.Java.Partiallyopenbook;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Word or Phrase to be checked as Palindrome");
        str=scan.nextLine().toLowerCase();
        scan.close();
        int fidx=0,bidx=str.length()-1;
        char fs,bs;
        boolean isvalid=false;
        while(fidx<bidx){
            fs=str.charAt(fidx);
            bs=str.charAt(bidx);
            if(Character.isLetter(fs)&&Character.isLetter(bs)){
                if(fs==bs){
                    isvalid=true;
                }
                else{
                    isvalid=false;
                }
                fidx++;
                bidx--;
            }
            else{
                if(!Character.isLetter(fs)){
                    fidx++;
                }
                else{
                    bidx--;
                }
            }
        }
        if(isvalid){
            System.out.println("The Entered phrase or word is a palindrome");
        }
        else
        System.out.println("The given word or phrase is not a palindrome");
    }
}
