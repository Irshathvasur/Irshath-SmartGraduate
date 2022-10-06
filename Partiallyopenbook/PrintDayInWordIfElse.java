package Practicecodes.Java.Partiallyopenbook;

public class PrintDayInWordIfElse {
    public static void main(String[] args) {
        int dayno=4;

        if(dayno==1){
            System.out.println("It is Sunday");
        }
        else if(dayno==2){
            System.out.println("It is Monday");
        }
        else if(dayno==3){
            System.out.println("It is Tuesday");
        }
        else if(dayno==4){
            System.out.println("It is Wednesday");
        }
        else if(dayno==5){
            System.out.println("It is Thursday");
        }
        else if(dayno==6){
            System.out.println("It is Friday");
        }
        else if(dayno==7){
            System.out.println("It is Saturday");
        }
        else{
            System.out.println("Correct the input");
        }
    }
}
