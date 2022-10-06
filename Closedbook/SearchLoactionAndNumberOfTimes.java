package Practicecodes.Java.Closedbook;

import java.util.Scanner;

class SearchLocationAndNumberOfTimes{
    public static void main(String[] args) {
        int arr[]={3,4,2,5,6,7,8,3,6,6};
        System.out.println("Enter the element to search for");
        Scanner scan=new Scanner(System.in);
        int search=scan.nextInt();
        scan.close();
        boolean check=true;
        int count=0;
        for(int idx=0;idx<arr.length;idx++){
            if(search==arr[idx]){
                System.out.println("The searched number is located in "+idx);
                check=false;
                count++;
            }
        }
        if(check){
            System.out.println("The searched number is not located in this array");
        }
        else{
            System.out.println("The Searched number occurs "+count+" number of times");
        }
    }
}