package Practicecodes.Java.Partiallyopenbook;

public class Swaparray {
    public static void main(String[] args) {
        int[] arr1={5,10,15,20,25};
        int[] arr2={12,24,36,48,60};
        if(swap(arr1, arr2)){
            System.out.println("Swapping is done");
            System.out.println("The elements of the first array are");
            for(int row=0;row<arr1.length;row++){
                System.out.print(arr1[row]+" ");
            }
            System.out.println("\nThe elements of the second array are");
            for(int row=0;row<arr2.length;row++){
                System.out.print(arr2[row]+" ");
            }
        }
        else
        System.out.println("The swapping was not possible");

    }
    public static boolean swap(int[] arr1,int[] arr2){
        boolean isdone=true;
        int temp;
        if(arr1.length==arr2.length)
        for(int row=0;row<arr1.length;row++){
            temp=arr1[row];
            arr1[row]=arr2[row];
            arr2[row]=temp;
        }
        else
        isdone=false;

        return isdone;
    }
}
