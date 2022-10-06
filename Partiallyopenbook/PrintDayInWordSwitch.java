package Practicecodes.Java.Partiallyopenbook;

public class PrintDayInWordSwitch {
    public static void main(String[] args) {
        int dayno=4;

        switch(dayno){
            case 1:
            System.out.println("It is Sunday");
            break;
            case 2:
            System.out.println("It is Monday");
            break;
            case 3:
            System.out.println("It is Tuesday");
            break;
            case 4:
            System.out.println("It is Wednesday");
            break;
            case 5:
            System.out.println("It is Thursday");
            break;
            case 6:
            System.out.println("It is Friday");
            break;
            case 7:
            System.out.println("It is Saturday");
            break;
            default:
            System.out.println("Correct the input");
        }
    }
}
