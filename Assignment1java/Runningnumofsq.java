package Practicecodes.Java.Assignment1java;

public class Runningnumofsq {
    public static void main(String[] args) {

        int lowerbound=1,upperbound=100;
        int sum=0,number=lowerbound;
        while(lowerbound<=upperbound){
            sum=sum+(lowerbound*lowerbound);
            lowerbound++;
        }
        System.out.printf("The sum of square numbers %d from %d is %d",number,upperbound,sum);
    } 
}
