// A java program describing comparison operators .


import java.util.*;

public class Comparison_op {
    public static void main(String[] args) {
        
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter first number=");
        num1=sc.nextInt();
        System.out.println("\nEnter second number=");
        num2=sc.nextInt();

        System.out.println("num1="+num1+ " num2="+num2+ " ");
        System.out.println("*****COMPARISON OPERATORS*****");
        
        System.out.println("1]Equality Operator (==)");
        if (num1==num2)
        {
            System.out.println("true");    
        }
        else
        {
            System.out.println("false");
        }

        System.out.println("2]InEquality Operator (!=)");
        if (num1!=num2)
        {
            System.out.println("true");    
        }
        else
        {
            System.out.println("false");
        }

        System.out.println("3]Greater Than Operator (>):");
        if(num1>num2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        System.out.println("4]less Than Operator (<):");
        if(num1<num2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        System.out.println("3]Greater Than or equal to Operator (>):");
        if(num1>=num2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        System.out.println("4]less Than or equal to Operator (<=):");
        if(num1<=num2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }


        
     sc.close();
    }
}
