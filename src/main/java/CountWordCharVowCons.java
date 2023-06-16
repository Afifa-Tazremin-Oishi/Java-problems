//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
//Output:
//Number of words: 4
//Number of chars without spaces: 17
//Number of vowels: 7
//Number of consonant: 10
//----------------------------------------------------------------------------------------------

import java.util.Scanner;

public class CountWordCharVowCons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");

        String str = input.nextLine();
        int count = 0;
        int wCount = 1;
        int vCount = 0; // vowel count
        int cCount = 0; // consonant count

        int len = str.length();

        for ( int i=0; i<=len-1; i++ ){

            if (str.charAt(i)!=' '){
                count++;
            }
            if ((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                wCount++;
            }
            if ((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o') || (str.charAt(i)=='u') ||
                    (str.charAt(i)=='A') || (str.charAt(i)=='E') || (str.charAt(i)=='I') || (str.charAt(i)=='O') || (str.charAt(i)=='U') ){
                vCount++;
            }
            else if( (str.charAt(i) > 'a' && str.charAt(i) < 'z') || (str.charAt(i) > 'A' && str.charAt(i) < 'Z')){
                cCount++;
            }
        }
        System.out.println("Total numbers of characters are: " + count);
        System.out.println("Total numbers of characters are: " + wCount);
        System.out.println("Total numbers of vowels are: " + vCount);
        System.out.println("Total numbers of consonants are: " + cCount);

    }
}
