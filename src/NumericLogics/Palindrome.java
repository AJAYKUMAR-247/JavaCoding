package NumericLogics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        System.out.println(isPalindrome(sc.nextInt()));
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int newNum = 0;
        while (num != 0) {
            int last = num % 10;
            newNum = (newNum * 10) + last;
            num /= 10;
        }
        return temp == newNum;
    }
}
