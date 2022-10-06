package Practicecodes.Java.Closedbook;

import java.util.Scanner;

public class QuadraticFunction {
    public static void main(String[] args) {
        System.out.println("Quadratic function of f(x)=ax^2+bx+c");
        System.out.println("1.Calculate");
        System.out.println("2.Create function with value");
        System.out.println("3.Extract value of a ,b or c");
        System.out.println("4.Modify values");
        System.out.println("5.Exit");
        function obj=new function();
        int choice;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Enter your choice");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                int x;
                System.out.println("Enter the value of x");
                x=scan.nextInt();
                System.out.println("The f(x) is "+obj.calculate(x));
                break;
                case 2:
                int a,b,c;
                System.out.println("Enter 3 values to create a function");
                a=scan.nextInt();
                b=scan.nextInt();
                c=scan.nextInt();
                function obj2=new function(a,b,c);
                break;
                case 3:
                System.out.println(obj.extractor());
                break;
                case 4:
                int a2,b2,c2;
                System.out.println("Enter 3 values to modify a function");
                a2=scan.nextInt();
                b2=scan.nextInt();
                c2=scan.nextInt();
                obj.modify(a2, b2, c2);
                break;
                default:
                System.out.println("Exiting the program");
                break;
            }
        }while(choice<5&&choice>0);
        scan.close();
    }
}

class function{
    Scanner scan=new Scanner(System.in);
    static int a,b,c;
    function(){
        function.a=1;
        function.b=1;
        function.c=1;
    }
    function(int a,int b,int c){
        function.a=a;
        function.b=b;
        function.c=c;
    }
    int extractor(){
        System.out.println("Enter which variable you want a,b or c");
        char ch=scan.next().charAt(0);
        switch(ch){
            case 'a':
            return function.a;
            case 'b':
            return function.b;
            case 'c':
            return function.c;
        }
        return 0;
    }
    void modify(int a,int b,int c){
        function.a=a;
        function.b=b;
        function.c=c;
    }

    int calculate(int x){
        int f;
        f=(function.a*(x*x))+(function.b*x)+function.c;
        return f;
    }
}
