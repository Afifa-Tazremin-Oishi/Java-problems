//11. Find out the second largest element of the given array
//numbers=[5,3,9,7,4,1,8]
//------------------------------------------------------------

public class SecondLargest {

    public static void main(String[] args) {

        int num[] = {5,3,9,7,4,1,8};
        int n = num.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0 ; i<n ; i++){

            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];

            }
            else if (num[i] > secondLargest && num[i] != largest){
                secondLargest = num[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest value");
        }
        else {
            System.out.println("The second largest value is: " + secondLargest);
        }
    }
}
