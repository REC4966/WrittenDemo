package Bigfactory;

import java.util.Arrays;
import java.util.Scanner;

public class MeiTuanTask {
    /*
     * 小美种树树
     * 一行三个整数x,y,z，分别表示浇水的成长值，施肥的成长值，果树成熟的成长值。1<=x,y,z<=10^9
     */
    public void PlantTrees(){
        Scanner in =new Scanner(System.in);
        int x =in.nextInt();
        int y = in.nextInt();
        int z =in.nextInt();
        int temp =3*x+y;
        int remainder =z % temp;
        if(remainder == 0){
            System.out.println((z/temp) *3 );
        }else{
            if (remainder <x+y){
                System.out.println((z/temp) *3 +1);
            }
            else if(remainder <2*x +y){
                System.out.println((z/temp) *3 +2);
            }
            else {
                System.out.println((z/temp) *3 +3);
            }
        }
    }
    /*
     * 小美结账
     * 
     */
    public void Checkout(){
        Scanner in  =new Scanner(System.in);
        int n =in.nextInt();
        int m = in.nextInt();
        int [] res =new int[m+1];
        for(int i = 0 ; i<n ;i++){
            int total = in.nextInt();
            int totalPrice =in.nextInt();
            int price =totalPrice/total+(totalPrice %total !=0 ? 1:0);
            for(int j = 0 ;j<total-1;j++){
                int number = in.nextInt();
                res[number]+=price;
            }
        }
        for (int res2 = 1; res2 < res.length; res2++) {
            System.out.print(res[res2]+" ");
        }
    }
    /**
     * 小美游戏
     */
    public void playGame(){
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int k =in.nextInt();
        int sum =0;
        int []arr =new int[n];
        for(int  i = 0;i <n;i++){
            arr[i]=in.nextInt();
        }
        for(int i = 0;i<k;i++){
            Arrays.sort(arr);
            int number = arr[n-1]*arr[n-2];
            arr[n-1] =number;
            arr[n-2] =1;
        }
        for (int i =0 ;i<n;i++) {
            sum+=arr[i];            
        }
        System.out.println(sum);
    } 
    public static void main(String[] args) {
        MeiTuanTask meiTuanTask =new MeiTuanTask();
        meiTuanTask.playGame();
    }
}
