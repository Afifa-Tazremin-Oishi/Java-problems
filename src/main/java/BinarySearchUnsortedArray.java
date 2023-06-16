// 4. Write a program that will find your key is found in the given array using binary search method
//numbers=[1,6,9,3,5,4,7]
//key=5
//---------------------------------------------------------------------

import java.util.ArrayList;

public class BinarySearchUnsortedArray {
    int first;
    int second;

    // Constructor
    public BinarySearchUnsortedArray(int x, int y) {
        this.first = x;
        this.second = y;
    }

    static ArrayList<BinarySearchUnsortedArray> aux_arr;

    // Function to make auxiliary array
    static void make_aux_array(int arr[], int n)
    {
        aux_arr = new ArrayList<BinarySearchUnsortedArray>();


        for (int i = 0; i < n; i++) {
            aux_arr.add(new BinarySearchUnsortedArray(arr[i], i));
        }

        aux_arr.sort((a, b) -> (-a.first + b.first));
    }


    static int binarySearch(int arr[], int n, int x)
    {

        int position = aux_arr.size() - 1;

        for (int i = 0; i < aux_arr.size(); i++) {
            BinarySearchUnsortedArray elem = aux_arr.get(i);
            if (elem.first >= x && elem.second >= 0)
                position = i;
        }

        if (position < n && aux_arr.get(position).first == x) {

            return aux_arr.get(position).second;
        }
        else {
            return -1;
        }
    }

    // Print Function
    static void print(int arr[], int n, int x)
    {
        make_aux_array(arr, n);
        int result = binarySearch(arr, n, x);

        if (result == -1) {
            System.out.println(-1);
        }
        else {
            System.out.println("The number found at index: " + result);
        }
    }

    public static void main(String[] args)
    {
        int[] arr
                = { 1,6,9,3,5,4,7 };
        int N = arr.length;
        int X = 5;

        // Function call
        print(arr, N, X);
    }
}

