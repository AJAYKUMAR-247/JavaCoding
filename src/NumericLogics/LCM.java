package NumericLogics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two numbers : ");
//        System.out.println(LCM(sc.nextInt(), sc.nextInt()));
        System.out.println(findLCM(sc.nextInt(), sc.nextInt()));

    }

    public static int LCM(int num1, int num2) {
        int max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                return max;
            }
            max++;
        }
    }

    public static int findLCM(int num1, int num2) {
        return (num1 * num2) / findHCF(num1, num2);
    }

    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
