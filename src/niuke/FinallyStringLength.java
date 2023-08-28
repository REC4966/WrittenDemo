package niuke;

import java.util.Scanner;

public class FinallyStringLength {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String temp =in.nextLine();
        String[] split = temp.split(" ");
        int length =split.length;
        String R =split[length-1];
        System.out.println(R.length());
    }
}
