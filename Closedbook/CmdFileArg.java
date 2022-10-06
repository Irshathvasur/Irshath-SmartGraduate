package Practicecodes.Java.Closedbook;

public class CmdFileArg {
    public static void main(String[] args) {
        System.out.println("The first argument is "+args[0]);
        System.out.println("The second argument is "+args[1]);
        int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        System.out.println("The sum of this two arguments is "+sum);
    }
}
