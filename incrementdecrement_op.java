//A java program describing increment decrement operators 

import java.util.*;

public class incrementdecrement_op 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number = ");
        int num =sc.nextInt();

            //increment operators
            System.out.println("\n****INCREMENT OPERATOR****\n");
            System.out.println(" -preincrement");
            ++num;
            System.out.println("\tvalue of num after preincrement is " +num);
            System.out.println(" -postincrement");
            num++;
            System.out.println("\tvalue of num after postincrement is " +num);
            
            //decrement operators
            System.out.println("\n****DECREMENT OPERATOR****\n");
            System.out.println(" -predecrement");
            --num;
            System.out.println("\tvalue of num after predecrement is " +num);
            System.out.println(" -postincrement");
            num--;
            System.out.println("\tvalue of num after postdecrement is " +num);
    
        sc.close();
    }
   
}
