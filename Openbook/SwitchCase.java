package Practicecodes.Java.Openbook;

public class SwitchCase {
    public static void main(String[] args) {
        int tech=1;

        switch(tech){
            case 1:{
                System.out.println("Java");
                break;
            }
            case 2:{
                System.out.println("ES6");
                break;
            }
            default:{
                System.out.println("Not listed");
            }
        }
    }
}
