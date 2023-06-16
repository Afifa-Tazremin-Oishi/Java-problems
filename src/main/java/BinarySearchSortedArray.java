import java.util.Scanner;

public class BinarySearchSortedArray {
    public static void main(String[] args) {
            int n, i, beg, end, mid=0;
            int[] arr ;
            Scanner input = new Scanner(System.in);
            System.out.println("How many values do you want to insert?");

            n = input.nextInt();
            arr = new int[n];

            System.out.println("Enter " + n + " values:");

            for( i=0; i<arr.length; i++)
                arr[i] = input.nextInt();
            System.out.println("Enter the element you want to search?");
            int target = input.nextInt();

            beg = 0;
            end = n-1;
            int position = 0;
            while(beg<=end) {
                mid = (beg + end) / 2;
                if (target == arr[mid]) {
                    position++;
                    break;
                } else if (target > arr[mid]) {
                    beg = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
            if(position>0)
                System.out.println(target + " found! At position "+ (mid+1));
            else
                System.out.println(target + " not found");

        }

}

