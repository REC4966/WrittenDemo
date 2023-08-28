package niuke;

import java.util.Scanner;

public class FlashbackNumber {
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        String str=String.valueOf(in);
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
