package Practicecodes.Java.Partiallyopenbook;

public class Extractdigit {
    public static void main(String[] args) {
        int num=34637,n=0;
        String revnum="";
        while(num>0){
            n=num%10;
            revnum=revnum+" "+n;
            num=num/10;
        }
        System.out.println("The reverse digits goes like "+revnum);
    }
}
