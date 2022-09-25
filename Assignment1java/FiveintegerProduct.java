package Practicecodes.Java.Assignment1java;

public class FiveintegerProduct {
    public static void main(String[] args) {
        int[] number=new int[6];
        for(int i=1;i<6;i++){
            number[i]=i*11;
        }   
        int product=number[1]*number[2]*number[3]*number[4]*number[5];
        System.out.print("The Product is ");
        System.out.println(product);
    }
}
