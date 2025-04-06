package NumericLogics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start : ");
        int start = sc.nextInt();
        System.out.print("Enter End : ");
        int end = sc.nextInt();

        int sum = 0;
        // Here the time complexity is O(n), because it depends upon the numbers of input, it have to execute for each input
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Sum : " + sum);

        System.out.println("SUM : " + Sum(start, end));
    }


    public static int Sum(int a, int b) {
        // Formula to find sum between two numbers, while using this formula no matter how much the input value is, it is going to execute only once.
        // So the time complexity will be O(1)
        return ((b * (b + 1) / 2) - (a * (a + 1) / 2) + a);
    }
}
