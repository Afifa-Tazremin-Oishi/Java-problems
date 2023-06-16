//12. Write a program that will shuffle (values will randomly change their position) from the given array
//
//numbers=[1,2,3,4,5,6,7,8,9,0]
//
//random output: 3 5 0 1 7 9 6 4 2 8
//-----------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0 ; i<10 ; i++){
            numbers.add(i);
        }
        System.out.println("Initial array numbers: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffled array numbers: " + numbers);
    }
}
