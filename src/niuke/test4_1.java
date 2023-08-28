package niuke;

import java.util.Scanner;

public class test4_1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        while(a!=0){
            int temp =a/2;
            System.out.println(temp);
            a=in.nextInt();
        }
    }
}
