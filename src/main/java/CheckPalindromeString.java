//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//Input: Civic
//Output: true
//Input: One
//Output: false
//-------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");

        String str = input.next().toLowerCase();
        String Org_str = str;
        String rev = "";

        int len = str.length();

        for (int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if (Org_str.equals(rev)){
            System.out.println("True!!! " + Org_str + " is a palindrom string");
        }
        else {
            System.out.println("False!!! " + Org_str + " is not a palindrom string");
        }
    }
}
