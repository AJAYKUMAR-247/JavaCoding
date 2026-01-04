package numeric_logics;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        System.out.println(ArmStrongNum(sc.nextInt()));
    }

    public static int ArmStrongNum(int num) {
        int length = (int) Math.log10(Math.abs(num)) + 1;
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            sum = (int) (sum + Math.pow(last, length));
            num /= 10;
        }
        return sum;
    }
}
