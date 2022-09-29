package Practicecodes.Java.Assignment1java;

public class Runningsumofmod7 {
    public static void main(String[] args) {

        int lowerbound=7,upperbound=1000;
        int sum=0,number=lowerbound;
        while(lowerbound<=upperbound){
            sum=sum+lowerbound;
            lowerbound=lowerbound+7;
        }
        System.out.printf("The sum of numbers divisible by 7 from %d to %d is %d",number,upperbound,sum);
    } 
}
