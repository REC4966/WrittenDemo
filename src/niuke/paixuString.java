package niuke;

import java.util.Arrays;
import java.util.Scanner;

public class paixuString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n =in.nextInt();
        String []a  = new String[n];
        for(int i = 0 ;i<n; i++){
            a[i] =in.next();
        }
        Arrays.sort(a);
        for(String b : a){
            System.out.println(b);
        }
    }
}
