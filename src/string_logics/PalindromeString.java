package string_logics;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(usingStringBuilder(str));
        System.out.println(usingTwoPointer(str));
        System.out.println(ignoreSpaceAndSpecialCharacters(str));
    }

    public static boolean usingStringBuilder(String str){
        return str.contentEquals(new StringBuilder(str).reverse()); // contentEquals - > Compares characters, Ignores the actual object type, No need to convert StringBuilder to String
//                                                                     contentEquals() exists to compare a String with any CharSequence, whereas equals() only compares String objects.


//        Time Complexity
//        Reversing string → O(n)
//        Comparing strings → O(n)
//        Total: O(n)

//        Space Complexity
//        New StringBuilder → O(n)
//        Reversed string stored → O(n)
    }

    public static boolean usingTwoPointer(String str){
        int left = 0, right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

//        Time: O(n)
//        Space: O(1)
    }

    public static boolean ignoreSpaceAndSpecialCharacters(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.contentEquals(new StringBuilder(str).reverse());

//         Time: O(n)
//         Space: O(0)
    }
}
