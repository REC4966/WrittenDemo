package niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int total =in.nextInt();
       int temp[]=new int[total];
       for(int i=0;i<total;i++){
        int a =in.nextInt();
        temp[i]=a;
       }
       Arrays.sort(temp);
       List list =new ArrayList<>();
       for (int temp2 : temp) {
        if(!list.contains(temp2))
        {
           list.add(temp2);
        }
       }
        for(int j =0;j<list.size();j++)
        {
            System.out.println(list.get(j));
        }
    }
    
}
