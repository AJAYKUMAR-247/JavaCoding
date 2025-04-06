package NumericLogics;

import java.util.Scanner;

public class HCF_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        System.out.println(findGCD(sc.nextInt(), sc.nextInt()));
    }

    public static int findGCD(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

