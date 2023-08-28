package niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Norepate {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List list =new ArrayList<>();
        int j =0;
        int total = in.nextInt();
        int arr[] =new int[total];
        if(total>=1 && total <=1000){
            for(int i =0; i<total;i++){
                int temp= in.nextInt();
                if(temp>= 1 && temp <=500){
                    arr[j] = temp;
                }else{
                    System.out.println("输入的数字的值不符合");
                }
                j++;
            }
            Arrays.sort(arr);
           for (int arr2 : arr) {
            if(!list.contains(arr2))
                list.add(arr2);
           }
           for(int k =0; k<list.size();k++){
            System.out.println(list.get(k));
           }
        }

    }
}
