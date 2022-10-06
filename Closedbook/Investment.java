package Practicecodes.Java.Closedbook;

public class Investment {
    public static void main(String[] args) {
        double investment=14000;
        investment=investment+(((double)40/100)*investment);
        investment=investment-1500;
        investment=investment+(((double)12/100)*investment);

        System.out.println("The Investment will worth "+investment);
    }
}
