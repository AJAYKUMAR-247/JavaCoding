package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class SwapArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            list.add(sc.nextInt());
        }

        Swap(list, 1, 3);

    }

    public static void Swap(ArrayList<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);

    }
}
