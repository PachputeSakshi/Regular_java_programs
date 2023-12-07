/* *******
   *     *
   *     *
   *******

 */

public class Main {
    public static void main(String args[])
    {   
    for (int i=1;i<=4;i++)
    {
    for (int j=1;j<=7;j++)
        {    
            if (i==1 || i==4 || j==1  || j==7) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
  
        System.out.println();
    }

/*  *
   ***
  *****
 *******
*********
 */

 for (int i=1;i<=5;i++) {
           
            for (int j=5-i;j>=1;j--) {
                System.out.print(" "); 
            }
            for (int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
/*i=1 j=4 k=1
 * i=2 j=3 k=2
 * i=3 j=2 k=3
 * i=4 j=1 k=4
 */

 /*10101
    0101
     101
      01
       1*/

   
    for (int i=0;i<=5;i++) {
        for (int j=0;j<i;j++) {
            System.out.print(" ");
        }
        for (int k=i+1;k<=5;k++) {
            System.out.print(k%2);
        } 
        System.out.println();
    }
    }

}

