package Practicecodes.Java.Assignment1java;

public class Leapyear {
    public static void main(String[] args) {
        int count=0,lowerbound,upperbound;
        lowerbound=999;
        upperbound=2010;
        int number=lowerbound;
        for(;number<=upperbound;number++){
            if(number%4==0){
                count++;
            }
        }
        System.out.printf("The number of leap years from %d to %d is %d",lowerbound,upperbound,count);
    }
}

