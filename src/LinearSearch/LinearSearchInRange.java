package LinearSearch;

import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 Numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your target: ");
        int target = sc.nextInt();

        System.out.println(linearSearchinRange(arr, target, 0, 6) );
    }

    static boolean linearSearchinRange(int[] arr, int target, int start, int end) {
        for (int i = start == 0 ? 0 : start - 1; i < end; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
