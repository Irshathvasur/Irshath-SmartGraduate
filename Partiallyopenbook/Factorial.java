package Practicecodes.Java.Partiallyopenbook;

public class Factorial{
    public static void main(String[] args) {
        int n = 3;
        int fn=0; // F(n) to be computed
        int fnMinus1 = 1; // F(n-1), init to F(2)
        int fnMinus2 = 1; // F(n-2), init to F(1)
        int nMax = 20; // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2; // Need sum to compute average
        double average; 
 
        System.out.println("The first " + nMax + " Fibonacci numbers are:"); 
        System.out.print(fnMinus1+" "+fnMinus2);
 
        while (n <= nMax) {
            fn=fnMinus1+fnMinus2;
            sum+=fn;
            System.out.print(" "+fn);
            ++n; 
            fnMinus2 = fnMinus1; 
            fnMinus1 = fn; 
        } 
        average=(double)sum/nMax;
        System.out.println("\nThe average of this first 20 factorials average is "+average);

    }
}