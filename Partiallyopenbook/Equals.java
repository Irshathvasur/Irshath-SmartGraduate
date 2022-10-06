package Practicecodes.Java.Partiallyopenbook;

public class Equals {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        int[] arr2={10,20,30,44,50};
        if(equals(arr1, arr2)){
            System.out.println("Both of the arrays are equal");
        }
        else
        System.out.println("The arrays are not equal");

    }
    public static boolean equals(int[] arr1,int[] arr2){
        boolean isvalid=true;
        if(arr1.length==arr2.length){
            for(int row=0;row<arr1.length;row++){
                if(!(arr1[row]==arr2[row])){
                    isvalid=false;
                    break;
                }
            }
        }
        return isvalid;
    }
}
