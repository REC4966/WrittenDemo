package niuke;

import java.util.Scanner;
import java.util.TreeMap;

public class mergeMap {
   public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, Integer> map = new TreeMap<>(); // 输出结果要求有序！
    while(sc.hasNextInt()){
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a,map.getOrDefault(a,0) + b);
        }
    }
    for (Integer i : map.keySet()) {
        System.out.println(i + " " + map.get(i));
    }
   }   
}
