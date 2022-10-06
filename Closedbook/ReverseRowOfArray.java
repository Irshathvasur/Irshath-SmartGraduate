package Practicecodes.Java.Closedbook;

public class ReverseRowOfArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int revarr[][]=new int[3][4];
        for(int row=0;row<arr.length;row++){
            int revcol=0;
            for(int col=arr[0].length-1;col>=0;col--){
                revarr[row][revcol]=arr[row][col];
                revcol++;
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                arr[row][col]=revarr[row][col];
            }
        }

        System.out.println("The reversed rows of arrays are ");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
