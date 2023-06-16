//10. Write a program that will give following output:
//12345
//2345
//345
//45
//5
//------------------------------------------------------

import java.util.Scanner;

public class NumberPattern10 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers of rows: ");

        n = input.nextInt();

        System.out.println("The pattern is: ");

        for (i=1 ; i<=n ; i++){

            for (j=i ; j<=n ; j++){
                System.out.print( j);
            }
            System.out.println();
        }
    }
}
