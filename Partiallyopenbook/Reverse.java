package Practicecodes.Java.Partiallyopenbook;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={60,48,36,24,12};
        reverse(arr);
        System.out.println("The elements of the array after reversing are");
            for(int row=0;row<arr.length;row++){
                System.out.print(arr[row]+" ");
            }
    }

    public static void reverse(int[] arr){
        int temp;
        for (int fIdx = 0, bIdx = arr.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            temp=arr[bIdx];
            arr[bIdx]=arr[fIdx];
            arr[fIdx]=temp;
        }
    }
}
