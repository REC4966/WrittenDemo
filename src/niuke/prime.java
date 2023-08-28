package niuke;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        long num = scanner.nextLong();
     
        for (long i = 2; i <= num;i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        System.out.println();
    }

    
    public static boolean isSnumber(Long n) {
        if (n < 6) {
            if (n == 2 || n == 3 || n == 5) return true;
        }
        if (n % 6 != 1 && n % 6 != 5) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    /**
     * HJ6 质数因子
     */
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     while (sc.hasNextLong()) {
    //         long l = sc.nextLong();
    //         print(l);
    //     }
    // }


    public static void print(Long num) {
        long x = num;
        for (int i = 2; i  <= x; ) {
            if (x % i == 0) {
                System.out.print(i + " ");
                x = x / i;
            } else {
                if (isSnumber(x)) {
                    System.out.println(x + " ");
                    break;
                }
                i++;
            }
        }
    }
}
