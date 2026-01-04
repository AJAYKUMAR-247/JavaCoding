package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }

        minValue(list);

    }

    public static void minValue(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }

        System.out.println(min);
    }
}
