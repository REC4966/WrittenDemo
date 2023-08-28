package niuke;

import java.util.Scanner;

public class FlashbacksSentence{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String tempString = in.nextLine();
        String[] split = tempString.split(" ");
        for (int i =split.length-1;i>=0;i--) {
            System.out.print(split[i]+" ");
        }
    }
}