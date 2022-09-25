package Practicecodes.Java.Assignment1java;

public class SevenIntegersum {
    public static void main(String[] args) {
        int[] number=new int[8];
        for(int i=1;i<8;i++){
            number[i]=i*11;
        }   
        int sum=number[1]+number[2]+number[3]+number[4]+number[5]+number[6]+number[7];
        System.out.print("The sum is ");
        System.out.println(sum);
    }
}
