/*Write a program to accept min and max no from the user and find out the greatest between all
i.smallest
ii.Even no
iii.Odd
iv.ascending
v.descending*/

package thursday_assignments;

import java.util.*;

public class ass_1dec {

    static int min,max,i,cal;
    static int arr[];
    static int totalElements = max - min + 1;
public static void main(String[] args) {
        accept();
    }
public static void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter minimum value:");
        min=sc.nextInt();
        System.out.println("Enter maximum value:");
        max=sc.nextInt();

        System.out.println("Total elements are:" +totalElements);
        arr=new int[totalElements+1];
        System.out.println("\nElements are");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        greatest();
        smallest();
        even();
        odd();
        ascending();
        descending();
    }

public static void greatest(){
         System.out.println();
        System.out.println("\nThe greatest no is= "+max);
    }
public static void smallest(){
        System.out.println();
        System.out.println("\nThe smallest no is= "+min);
    }

public static void even()
{
     System.out.println();
    System.out.println("Even numbers in array are= ");
        for(int j=min;j<=max;j++){
            if (j%2==0) {
                arr[i]=j;
                System.out.print( " "+arr[i]);
            }  
    }
}
public static void odd()
{
     System.out.println();
    System.out.println("\nodd numbers in array are= ");
        for(int j=min;j<=max;j++){
            if (j%2==1) {
                arr[i]=j;
                System.out.print( " "+arr[i]);
            }  
    }
}
public static void ascending()
{
    System.out.println();
    System.out.println("\nascending order of array= ");
        for(int i=min;i<=max;i++){
                System.out.print( i+" ");
    }
}

public static void descending()
{
     System.out.println();
    System.out.println("\ndescending order of array= ");
        for(int i=max;i>=min;i--){
                System.out.print( i+" ");
    }
}

}
