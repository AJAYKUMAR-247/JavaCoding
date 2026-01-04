package numeric_logics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which number table : ");
        int tableNo = sc.nextInt();
        System.out.println("Enter no of Rows : ");
        int rows = sc.nextInt();

        MultiTable(rows, tableNo);
    }

    public static void MultiTable(int rows, int tableNo) {
        for (int i = 1; i <= rows; i++) {
            System.out.println(i + " * " + tableNo + " = " + i * tableNo);
        }
    }
}
