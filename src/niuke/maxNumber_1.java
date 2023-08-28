package niuke;

import java.util.Scanner;

public class maxNumber_1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Long n= in.nextLong();
        System.out.println(n*(n-1)-1);
    }
}
