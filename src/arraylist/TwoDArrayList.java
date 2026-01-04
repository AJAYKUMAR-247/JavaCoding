package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> TwoDArrayList = new ArrayList<>();

        for(int i = 0; i<3; i++){
            TwoDArrayList.add(i, new ArrayList<Integer>());
        }

        for(int i = 0; i<TwoDArrayList.size(); i++){
            for(int j = 0; j<3; j ++) {
                TwoDArrayList.get(i).add(j, sc.nextInt());
            }
        }

        for(ArrayList<Integer> arr : TwoDArrayList){
            System.out.println(arr);
        }
    }
}
