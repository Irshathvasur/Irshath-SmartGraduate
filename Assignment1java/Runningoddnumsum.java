package Practicecodes.Java.Assignment1java;

public class Runningoddnumsum {
    public static void main(String[] args) {

        int lowerbound=1,upperbound=1000;
        int sum=0,number=lowerbound;
        while(lowerbound<=upperbound){
            sum=sum+lowerbound;
            lowerbound=lowerbound+2;
        }
        System.out.printf("The sum of odd numbers %d from %d is %d",number,upperbound,sum);
    } 
}
