package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoDuplicationNum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num =in.nextInt();
        List<Integer> list =new ArrayList<>();
        while(num !=0 ){
            int a = num % 10 ;
            if(!list.contains(a)){
                list.add(a);
            }
            num = num/10;
        }
     for (Integer a : list) {
        System.out.print(a);
     }
    }
}
