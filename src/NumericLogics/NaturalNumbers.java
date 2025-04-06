package NumericLogics;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start :");
        int start = sc.nextInt();
        System.out.print("Enter end :");
        int end = sc.nextInt();

        System.out.print("Natural Numbers from " + start + " to " + end + " are :");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        Reverse(start, end);
    }

    public static void Reverse(int start, int end) {
        System.out.print("The Reverse of Natural Numbers : ");
        for (int i = end; i >= start; i--) {
            System.out.print(i + " ");
        }
    }
}
