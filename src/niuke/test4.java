package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List list =new ArrayList();
        int temp =in.nextInt();
        while(temp !=0){
            list.add(temp);
            temp = in.nextInt();
        }
        int Results[] =new int[list.size()];
        for (int i =0;i<list.size();i++) {
            int Result =0;
           int temp2 = (int)list.get(i);
           if(temp2 ==2)
           {
            Result++;
           }
           if(temp2>2){
            int a = temp2 / 3;
            int b = temp2 % 3;
            while(temp2>=2){
                Result +=a;
                temp2 = a+b;
                if(temp2 ==2){
                    Result++;
                    break ;
                }
                if(temp2>2){
                a = temp2 / 3;
                b = temp2 % 3;
                }
            }
           }
           Results[i] =Result;
        }
     for (int result : Results) {
        System.out.println(result);
     }
    }
}
