package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target value : ");
        int target = sc.nextInt();

        System.out.println(linearSearch(arr, target));
    }

    static boolean linearSearch(int[] arr, int target) {
        for(int ele : arr){
            if(ele == target){
                return true;
            }
        }
        return false;
    }
}
