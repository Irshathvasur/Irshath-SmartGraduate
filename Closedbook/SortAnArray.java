package Practicecodes.Java.Closedbook;

public class SortAnArray {
    public static void main(String[] args) {
        int arrtoascend[]={3,9,2,6,4};
        int arrtodescend[]={3,9,2,6,4};
        int temp=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arrtoascend[i]<arrtoascend[j]){
                    temp=arrtoascend[i];
                    arrtoascend[i]=arrtoascend[j];
                    arrtoascend[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arrtodescend[i]>arrtodescend[j]){
                    temp=arrtodescend[i];
                    arrtodescend[i]=arrtodescend[j];
                    arrtodescend[j]=temp;
                }
            }
        }
        System.out.println("The ascending sorted array is ");
        for(int idx=0;idx<arrtoascend.length;idx++){
            System.out.print(arrtoascend[idx]+" ");
        }
        System.out.println("\nThe descending sorted array is ");
        for(int idx=0;idx<arrtodescend.length;idx++){
            System.out.print(arrtodescend[idx]+" ");
        }

    }
}
