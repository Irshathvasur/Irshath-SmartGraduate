package Practicecodes.Java.Partiallyopenbook;

public class ComputePI {
    public static void main(String[] args) {
        double PI=0.0;
        int MAX_Denominator=1000;
        for(int denominator=1;denominator<=MAX_Denominator;denominator+=2){
            if(denominator%4==1){
                PI+=(double)1/denominator;
            }
            else if(denominator%4==3){
                PI-=(double)1/denominator;
            }
            else{
                System.out.println("Not possible as we only work with odd numbers");
            }
        }
        System.out.println("Th PI value we got by this formula is "+PI);
        /* 
        The result will be nowhere near the actual value because
        This formula for computing PI demands infinity thus computing pi with this formula isn't possible
        */
    }
}
