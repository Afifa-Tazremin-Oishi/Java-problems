
//2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
//-----------------------------------------------------------------------------------------

import java.util.Scanner;

public class SwapWithoutTempVariable {
    public static void main(String[] args) {
      int a, b, c ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number a = ");
        a = input.nextInt();
        System.out.println("Enter the second number b = ");
        b = input.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("After swapping the output is a = " + a + "," + " b = " + b );

    }
}
