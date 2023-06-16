//6. Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array
//------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {

        double[] val = new double[10];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        System.out.println("Random number array");

        for (int i = 0; i < val.length; i++) {
            val[i] = new Random().nextInt(100);
            System.out.println(val[i]);
        }
        for (int i = 0; i < val.length; i++) {
            if (val[i] < min)
                min = val[i];
            if (val[i] > max)
                max = val[i];
        }
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);
    }
}

