package niuke;

import java.util.Stack;

public class maxPatro {
    // 牛群最大警戒值问题
    public int maxPatrolValue1 (int[] values) {
        // write code here
        int max =0;
        for(int i = 0 ;i<values.length;i++){
            int temp =values[i];
            for(int j = i+2;j<values.length;j+=2){
                temp+=values[j];
                if(temp> max){
                    max = temp;
                }
            }
        }
        return max;
    }
    public int maxPatrolValue(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        // 选择第一头牛的情况
        int prevMax1 = 0;
        int currentMax1 = values[0];

        for (int i = 2; i < values.length - 1; i++) {
            int temp = currentMax1;
            currentMax1 = Math.max(currentMax1, prevMax1 + values[i]);
            prevMax1 = temp;
        }

        // 不选择第一头牛的情况
        int prevMax2 = 0;
        int currentMax2 = 0;

        for (int i = 1; i < values.length; i++) {
            int temp = currentMax2;
            currentMax2 = Math.max(currentMax2, prevMax2 + values[i]);
            prevMax2 = temp;
        }

        // 取较大值作为结果
        return Math.max(currentMax1, currentMax2);
    }
    // 牛群配对问题
    public boolean isValidPairing (String s) {
        // write code here
        int  length = s.length() % 2 ;
        if(length != 0) return false;
        Stack<Character> stk =new Stack<>();
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if(stk.empty()){
                stk.push(c);
            }
            else if( c =='B'){
                if(stk.peek()=='A') stk.pop();
                else stk.push(c);
            }
            else if (c == 'D'){
                if(stk.peek()=='C') stk.pop();
                else stk.push(c);
            }
            else stk.push(c);
        }
        return stk.empty();
    }

    // 牛排序i(冒泡)
    public int[] sortCows (int[] nums) {
        // write code here
        for(int i = 0 ;i<nums.length-1;i++){
            for(int j =0; j<nums.length-i-1;j++){
                if (nums[j] > nums[j + 1]) {
                    // 交换arr[j+1]和arr[j]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        maxPatro t =new maxPatro();
         int []a = {2,3,2};
         int maxPatrolValue = t.maxPatrolValue(a);
         System.out.println(maxPatrolValue);
        // String s ="ACDB";
        // t.isValidPairing(s);
    }
}
