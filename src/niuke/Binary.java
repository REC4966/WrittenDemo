package niuke;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int nextInt = in.nextInt();
        //十进制转2进制
        String binaryString = Integer.toBinaryString(nextInt);
        String[] split = binaryString.split("");
        int count =0;
        for (String split2 : split) {
            if(split2.equals("1")){
                count++;
            }
        }
        System.out.println(count);
    }
}
//十进制转8进制
        // String octalString = Integer.toOctalString(nextInt);
        // //十进制转16进制
        // String hexString = Integer.toHexString(nextInt);

        //二转十
        // int decimal = Integer.parseInt(String.valueOf(nextInt), 2);

        // int decimal = Integer.parseInt(String.valueOf(nextInt), 8);
        // int decimal = Integer.parseInt(String.valueOf(nextInt), 16);