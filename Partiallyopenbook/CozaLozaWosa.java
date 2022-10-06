package Practicecodes.Java.Partiallyopenbook;

public class CozaLozaWosa {
    public static void main(String[] args) {
        String cozlozawoza="";

        for(int i=1;i<=110;i++){
            if(i%3==0){
                cozlozawoza+="coza";
            }
            if(i%5==0){
                cozlozawoza+="loza";
            }
            if(i%7==0){
                cozlozawoza+="woza";
            }
            if(!(i%3==0||i%5==0||i%7==0)){
                cozlozawoza+=i;
            }
            if(i%11==0){
                cozlozawoza+="\n";
            }
            else
            cozlozawoza+=" ";
        }
        System.out.println(cozlozawoza);
    }
}
