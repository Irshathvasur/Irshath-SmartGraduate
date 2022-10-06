package Practicecodes.Java.Closedbook;

public class Prog17Test {

    Prog17Test(int val){

    }
    static int stat=12;
    public static void main(String[] args) {
        final int CONST=10;
        //Attempting to modify constant member
        //CONST=12; The final local variable can not be changed
        //Attempting to instantiate a class object without necessary parameters
        //Prog17Test obj=new Prog17Test(); The constructor is undefined
        System.out.println(CONST);
    }
    void method(){
        stat=30;
    }
}
