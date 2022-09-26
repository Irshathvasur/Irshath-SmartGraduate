package Practicecodes.Java.Assignment1java;

public class Arithmetictest {
    public static void main(String[] args) {
        int number1=98,number2=5;
        int sum, difference, product, quotient, remainder;
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.println("The Sum, Difference, Product, Quotient, Remainder of "+number1+" and "+number2+" is "+sum+" "+difference
        +" "+product+" "+quotient+" and "+remainder);
        ++number1;
        --number2;
        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number2);
        quotient=number1/number2;
        System.out.println("The new quotient of the number1 and number2 is "+quotient);
    }
}
