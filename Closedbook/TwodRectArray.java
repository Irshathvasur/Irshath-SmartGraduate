package Practicecodes.Java.Closedbook;

public class TwodRectArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.printf("%4d ",arr[row][col]);
            }
            System.out.println();
        }
    }
}
