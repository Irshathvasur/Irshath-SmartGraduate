package Practicecodes.Java.Closedbook;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={5,10,15,20,25};
        int[] revarr=new int[5];
        int idx1=0;
        for(int idx=arr.length-1;idx>=0;idx--){
            revarr[idx]=arr[idx1];
            idx1++;
        }
        System.out.println("The reversed array is ");
        for(int idx=0;idx<revarr.length;idx++){
            System.out.print(revarr[idx]+" ");
        }
    }
}
