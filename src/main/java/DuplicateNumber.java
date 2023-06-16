//14. Find out the duplicate numbers in the given array and in which position they are found.
//numbers=[1,2,3,1,2,4,5,6,4]
//
//Output:
//Duplicate value: 1 at index 3
//Duplicate value: 2 at index 4
//Duplicate value: 4 at index 8
//------------------------------------------------------------------------------------------------

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};

        // Create a map to store numbers and their positions
        Map<Integer, Integer> numberPositions = new HashMap<>();

        // Iterate over the array
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            // Check if the number is already in the map
            if (numberPositions.containsKey(number)) {
                System.out.println("Duplicate value: " + number + " at index " + i);
            } else {
                // Store the position of the number in the map
                numberPositions.put(number, i);
            }
        }
    }
}
