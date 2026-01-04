package numeric_logics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        System.out.println(Sum(sc.nextInt()));

    }

    public static int Sum(int num) {
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }
        return sum;
    }
}
