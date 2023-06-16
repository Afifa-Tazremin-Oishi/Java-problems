//18. Write a program that will take integer numbers as user input continuously and print the sum of numbers until user input q from the keyboard. When user input q, program will be quit. If user inputs another character, then the program will ask to input the number again.
//----------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        String choice = "";

        int sum = 0;
        int i = 0;
        //int product = 1;
        //int count = 0;
        Scanner input = new Scanner(System.in);

            while (!choice.equals("q")) {
                System.out.println("Please enter a number or q to quit...!");
                choice = input.next();

                if (!choice.equals("q")) {
                    int number = Integer.parseInt(choice);
                    sum = sum + number;
                    //product = product*number;
                    //count++;
                }
            }

            System.out.println("Sum of the numbers is: " + sum);

    }
}

