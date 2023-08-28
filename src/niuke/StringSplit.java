package niuke;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length() % 8 ;
        if(length !=0){
            for(int i=0;i<8-length;i++){
                str+="0";
            }
        }
        while(str.length()>=8){
            String substring = str.substring(0, 8);
            System.out.println(substring);
            str=str.substring(8);
        }
    }
}
