//13. Take any number as input and print the reverse of the number
//input: 12345
//output: 54321
//-----------------------------------------------------------------

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int n, r ;
        System.out.println("Enter any number: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("The reverse number is: ");
        while(n>0){
            r = n%10;
            System.out.print(r);
            n = n/10;
        }
    }
}
