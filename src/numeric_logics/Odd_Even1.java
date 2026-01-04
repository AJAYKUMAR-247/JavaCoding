package numeric_logics;

import java.util.Scanner;

public class Odd_Even1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        System.out.println(isEven(sc.nextInt()));
        System.out.println(isOdd(sc.nextInt()));
    }

    public static boolean isOdd(int num) {
        return (num / 2) * 2 != num;
    }

    public static boolean isEven(int num) {
        return (num / 2) * 2 == num;
    }
}
