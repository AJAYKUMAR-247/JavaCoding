package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Initialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i, sc.nextInt());
        }

        System.out.println(list);
    }
}
