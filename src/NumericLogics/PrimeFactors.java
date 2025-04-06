package NumericLogics;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        PrimeFactor(sc.nextInt());
    }

    public static void PrimeFactor(int num) {
        System.out.println("The prime factors are : ");
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 1) {
            System.out.println(num);
        }
    }
}
