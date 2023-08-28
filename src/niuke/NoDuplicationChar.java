package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoDuplicationChar {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String tempString = in.nextLine();
        char[] charArray = tempString.toCharArray();
        List<Character> list =new ArrayList<>();
        int count=0;
        for (char a : charArray) {
            if(!list.contains(a)){
                list.add(a);
                count++;
            }
        }
        System.out.println(count);
    }
}
