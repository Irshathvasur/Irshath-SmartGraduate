package Practicecodes.Java.Partiallyopenbook;

public class Harmonicsum {
    public static void main(String[] args) {
        int MAX_Denominator=50000;
        double L2Rsum=0.0;
        double R2Lsum=0.0;
        double abs_difference=0.0;

        for(int denominator=1;denominator<=MAX_Denominator;denominator++){
            L2Rsum+=(double)1/denominator;
        }
        for(int denominator=MAX_Denominator;denominator>=1;denominator--){
            R2Lsum+=(double)1/denominator;
        }
        abs_difference=L2Rsum-R2Lsum;

        if(L2Rsum>R2Lsum){
            System.out.println("Left to right sum of harmonic series is greater than Right to left \nthe difference is "+Math.abs(abs_difference));
            System.out.println("Sum of L2R "+L2Rsum);
            System.out.println("Sum of R2L "+R2Lsum);
        }
        else if(R2Lsum>L2Rsum){
            System.out.println("Right to left sum of harmonic series is greater than Left to right \nthe difference is "+Math.abs(abs_difference));
            System.out.println("Sum of L2R "+L2Rsum);
            System.out.println("Sum of R2L "+R2Lsum);            
        }
        else{
            System.out.println("Both are same");
            System.out.println("Sum of L2R "+L2Rsum);
            System.out.println("Sum of R2L "+R2Lsum);   
        }
    }
}
