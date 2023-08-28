package niuke;

import java.math.BigInteger;
import java.util.Scanner;


public class BaseConversion {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String H16 = in.nextLine();
        // 16 进制转 10进制
        
        System.out.println((new BigInteger( H16.substring(2),16)));
    }
}
