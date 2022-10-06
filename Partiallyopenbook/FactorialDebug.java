package Practicecodes.Java.Partiallyopenbook;

public class FactorialDebug {
    public static void main(String[] args) {
        int n = 20;
        long factorial = 1l; 
        // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) { // i = 1, 2, 3, ..., n
        factorial = factorial * i; // *
        } 
        System.out.println("The Factorial of " + n + " is " + factorial); 
    }
}
