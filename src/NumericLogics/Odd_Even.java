package NumericLogics;

import java.util.Arrays;
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to check whether it is odd : ");
        System.out.println(isOdd(sc.nextInt()));

        System.out.println("Enter Number to check whether it is even: ");
        System.out.println(isEven(sc.nextInt()));

        System.out.println("Enter a 10 numbers to get even : ");
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Array1 : " + Arrays.toString(arr1));
        System.out.println("Even from Array1 :" + Arrays.toString(evenNums(arr1)));
        System.out.println("Odd from Array1 :" + Arrays.toString(oddNums(arr1)));

    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int[] evenNums(int[] arr) {
        return Arrays.stream(arr).filter((num) -> num % 2 == 0).toArray();
    }

    public static int[] oddNums(int[] arr) {
        return Arrays.stream(arr).filter((num) -> num % 2 != 0).toArray();
    }
}
