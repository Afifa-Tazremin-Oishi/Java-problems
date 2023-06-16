//5. Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]
//key=5
//-----------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many values you want to insert?");

        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " values:");

        for(int i=0; i<arr.length; i++)
            arr[i] = input.nextInt();

        System.out.println("Enter element you want to search?");
        int target = input.nextInt();

        int position = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                position = i;
                 break;
            }
        }
        if(position!=-1)
            System.out.println(target + " found! At position "+ (position+1));
        else
            System.out.println(target + " not found");
    }
}
