package Practicecodes.Java.Partiallyopenbook;

class ArraytoString{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println(arraytostr(arr));
    }

    public static String arraytostr(int[] arr){
        String str="[";
        for(int row=0;row<arr.length;row++){
            str=str+arr[row]+", ";
        }
        str=str+"\b\b]";
        return str;
    }
}