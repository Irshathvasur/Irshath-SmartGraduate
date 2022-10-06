package Practicecodes.Java.Partiallyopenbook;

public class Contains {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        if(contains(arr, 30)){
            System.out.println("The given array contains the key");
        }
        else
        System.out.println("The given array doesn't contain the key");
    }

    public static boolean contains(int[] arr,int key){
        boolean isvalid=false;
        for(int row=0;row<arr.length;row++){
            if(arr[row]==key)
            isvalid=true;
        }
        return isvalid;
    } 
}
