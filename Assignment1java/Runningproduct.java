package Practicecodes.Java.Assignment1java;

public class Runningproduct {
    public static void main(String[] args) {

        int lowerbound=1,upperbound=10;
        int product=1,number=lowerbound;
        while(lowerbound<=upperbound){
            product=product*lowerbound;
            lowerbound++;
        }
        System.out.printf("The product of numbers %d from %d is %d",number,upperbound,product);
    } 
}
