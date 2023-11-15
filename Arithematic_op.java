// A Java program for Arithematic Operators 

import java.util.*;

public class Arithematic_op {
    public static void main(String[] args) {
        // Taking input using scanner class
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        num1=sc.nextInt();
        System.out.println("Enter second number = ");
        num2=sc.nextInt();

        System.out.println("******ARITHEMATIC OPERATORS*******");
        System.out.println();

        // 1] Addition operator( + )
        System.out.println("Addition operator( + )");
        int addition =num1 + num2;
        System.out.println("\tAddition of " +num1+ " and " +num2+ " is = " +addition);
        System.out.println();

        // 2] subtraction operator( - )
        System.out.println("Subtraction operator( - )");
        int subtraction =num1 - num2;
        System.out.println("\tSubtraction of " +num1+ " and " +num2+ " is = " +subtraction);
        System.out.println();

        // 3] Multiplication operator( * )
        System.out.println("multiplication operator( * )");
        int multiplication =num1 * num2;
        System.out.println("\tMultiplication of " +num1+ " and " +num2+ " is = " +multiplication);
        System.out.println();

        // 4] Division operator( / )
        System.out.println("Division operator( / )");
        int Division =num1 / num2;
        System.out.println("\tDivision of " +num1+ " and " +num2+ " is = " +Division);
        System.out.println();

    }
}
