//8. Print the prime numbers of 2 to 100
//--------------------------------------

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your lower number: ");
        int lower = input.nextInt();
        System.out.println("Enter your upper number: ");
        int upper = input.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for(int n=lower; n<=upper; n++){
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    c++;
            }
            if (c == 2)
                a.add(n);
            else
                continue;

        }
        System.out.println(a);

        }
}

