package string_logics;

import java.util.Scanner;

public class ReverseAString {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        java.lang.String str = sc.nextLine();

        System.out.println(UsingStringBuilder(str));
        System.out.println(UsingCharArray(str));
    }

    public static String UsingStringBuilder(String str){
      return new StringBuilder(str).reverse().toString();

//        Time Complexity
//        O(n)
//        Because each character is visited once while reversing.
//
//        Space Complexity
//        O(n)
//        A new StringBuilder object is created to store the reversed string.
    }

    public static String UsingCharArray(String str){
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while(left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
//        Time: O(n)
//        Space: O(n) (char array)
    }
}
