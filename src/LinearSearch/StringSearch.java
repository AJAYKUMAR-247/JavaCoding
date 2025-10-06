package LinearSearch;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter a char to search: ");
        char ch = sc.next().charAt(0);

        System.out.println(linearStringSearch(str, ch));

    }

    static boolean linearStringSearch(String str, char ch){
        for(char ele : str.toCharArray()){
          if(ele == ch){
              return true;
          }
        }
        return false;
    }
}
