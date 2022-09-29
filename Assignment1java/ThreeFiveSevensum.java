package Practicecodes.Java.Assignment1java;

public class ThreeFiveSevensum {
    public static void main(String[] args) {
        int lowerbound=0,upperbound=1000;
        int sum=0,number=lowerbound;
        while(number<=upperbound){
            if(number%3==0){
                sum+=number;
            }
            else if(number%5==0){
                sum+=number;
            }
            else if(number%7==0){
                sum+=number;
            }
            number++;
        }
        System.out.println("Sum of all the running integers between 1 to 1000 divisable by 3,5 and 7 is "+sum);
    }
}
