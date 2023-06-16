//9. Write a program that will give following output:
//1
//12
//123
//1234
//12345
//----------------------------------------------------

import java.util.Scanner;

public class PatternNum9 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers of rows: ");

        n = input.nextInt();

        System.out.println("The pattern is: ");

        for (i=1 ; i<=n ; i++){

            for (j=1 ; j<=i ; j++){
                System.out.print( j);
            }
            System.out.println();
        }
    }
}
