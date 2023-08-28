package niuke;

import java.util.Scanner;

public class Charcount {
    public static void main(String[] args) {
        int count=0;
        Scanner in =new Scanner(System.in);
        char[]  temp = in.nextLine().toCharArray();
        char[] charArray = in.next().toCharArray();
        String b = String.valueOf(charArray[0]);
        for (char temp2 : temp) {
            String c = String.valueOf(temp2);
            if(b.equalsIgnoreCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
