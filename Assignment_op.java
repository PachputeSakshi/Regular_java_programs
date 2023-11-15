// A java program describing assignment operators

public class Assignment_op {
    public static void main(String[] args) {
        
        int num;
        
        System.out.println("******ASSIGNMENT OPERATORS*******");
        System.out.println();

        // 1] Simple Assignment Operator( = ) 
        //Assigns the value on the right to the variable on the left.
        System.out.println("1]Simple Assignment Operator( = ): ");
        num=10;
        System.out.println("\tAssigns the value " +num+ " to num");
        System.out.println();

        // 2] Add and Assign Operator( += )
        //Adds the value on the right to the current value of the variable on the left.
        System.out.println("2]Add and Assign Operator( += ):");
        num += 5;
        System.out.println("\tAdd and assigns the value " +num );
        System.out.println();

        // 3] Subtract and Assign Operator( -= )
        //Subtracts the value on the right from the current value of the variable on the left.
        System.out.println("3]Subtract and Assign Operator( -= ):");
        num -=2;
        System.out.println("\tSubtracts and assigns the value " +num );
        System.out.println();

        // 4] Multiply and Assign Operator( *= )
        //Multiplies the current value of the variable on the left by the value on the right.
        System.out.println("4]Multiply and Assign Operator( *= ):");
        num *=5;
        System.out.println("\tMultiplies and assigns the value " +num);
        System.out.println();

        //5] Divide and Assign Operator( /= )
        //Divides the current value of the variable on the left by the value on the right.
        System.out.println("5]Divide and Assign Operator( /= ):");
        num /=2;
        System.out.println("\tDivides and assigns the value " +num);
        System.out.println();

        //6] Modulus and Assign Operator( %= )
        //Assigns the remainder of the division of the current value of the variable on the left by the value on the right.
        System.out.println("6]Modulus and Assign Operator( %= ):");
        num %=2;
        System.out.println("\tassigns remainder to variable " +num);
        System.out.println();
    }
}
