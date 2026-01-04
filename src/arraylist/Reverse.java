package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        reverse(list);

        System.out.println(list);
    }

    public static void reverse(ArrayList<Integer> list) {

        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            Swap(list, start, end);
            start++;
            end--;
        }
    }

    public static void Swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
