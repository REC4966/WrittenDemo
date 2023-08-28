package niuke;

import java.util.Scanner;

public class maxNumber {
    public static int CommonDivisor(int a,int b){
        int max =a>b ? a:b;
        for(int i =max;i>0;i--)
        {
            if(a%i ==0 && b%i ==0){
                return i;
            }
        }
        return 0;
    }
    public static int CommonMultiple(int a,int b){
        int min =a<b ?a:b;
        for(int i=min;i<=a*b;i++){
            if(i%a==0 && i%b ==0){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int maxResult  =0;
        Scanner in =new Scanner(System.in);
        int temp = in.nextInt();
        for(int i =1;i<=temp;i++)
        {
            for(int j =i+1;j<=temp;j++){
               int commonDivisor = CommonDivisor(i,j);
               int commonMultiple = CommonMultiple(i,j);
               int tempResult =commonMultiple-commonDivisor;
               if(tempResult>maxResult)
               {
                maxResult=tempResult;
               }
            }
        }
        System.out.println(maxResult);
    }
}
