package Practicecodes.Java.Partiallyopenbook;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0; 
        double average; 
        final int LOWERBOUND = 1; 
        final int UPPERBOUND = 100; 
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) 
        { 
            sum += number; 
        } 
        int n=UPPERBOUND-LOWERBOUND+1;
        average=(double)sum/n;
        System.out.printf("The sum of %d to %d is %d\n",LOWERBOUND,UPPERBOUND,sum);
        System.out.println("The average is "+average);
    }
}
