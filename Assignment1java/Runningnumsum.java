package Practicecodes.Java.Assignment1java;

public class Runningnumsum {
    public static void main(String[] args) {

        int lowerbound=9,upperbound=899;
        int sum=0,number=lowerbound;
        while(lowerbound<=upperbound){
            sum=sum+lowerbound;
            lowerbound++;
        }
        System.out.printf("The sum of number %d from %d is %d",number,upperbound,sum);
    } 
}
