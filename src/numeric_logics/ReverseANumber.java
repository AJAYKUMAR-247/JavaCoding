package numeric_logics;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        System.out.println(Reverse(sc.nextInt()));
    }

    public static int Reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int last = num % 10;
            reversed = (reversed * 10) + last;
            num /= 10;
        }
        return reversed;
    }
}
