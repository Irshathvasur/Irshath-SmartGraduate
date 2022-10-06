package Practicecodes.Java.Closedbook;

public class Primenumber {
        public static void main(String[] args) {
            int count=0;
            String prime="";
            for(int i=0;i<=100;i++){
                count=0;
                for(int j=i;j>0;j--){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                prime=prime+i+" ";
                }
            }
            System.out.println(prime);
        }
}
