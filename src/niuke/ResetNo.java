package niuke;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ResetNo{
    private  class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }
  //列表的奇偶函数排序
    public ListNode reorderCows1(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode temp1 = head.next;
    ListNode temp2 = head;
    ListNode temp3 = temp1;

    while (temp1 != null && temp2 != null && temp1.next != null && temp2.next != null) {
        temp2.next = temp1.next;
        temp2 = temp2.next;
        temp1.next = temp2.next;
        temp1 = temp1.next;
    }

    temp2.next = temp3;
    return head;
}
public  int []  reorderCows (int[] nums) {
    int []b =new  int[nums.length];
    int index =0;
  for (int i = 0; i<nums.length;i++) {
     if(nums[i] % 2 ==0){
        b[index] =nums[i];
        index++;
     }
  }
  for (int i = 0; i<nums.length;i++) {
     if(nums[i] % 2 !=0){
        b[index] =nums[i];
        index++;
     }
  }
  return b;
}
// 矩阵螺旋输出
public int[] spiralOrder (int[][] matrix) {
    // write code here
    int[] res =new int[matrix.length *matrix[0].length];
    int m = matrix.length;
    int n = matrix[0].length;
    int top = 0, bottom = m - 1, left = 0, right = n - 1;
    int  index  =0;
    while (top <= bottom && left <= right) {
        //左边界向下
            for(int i = top ;i<= bottom;i++){
                res[index] = matrix[i][left];
                index ++;
            }
            left ++;
        //下边界 向右
            for(int i =left ;i<=right ;i++)
            {
                res[index] = matrix[bottom][i];
                index ++;
            }
            bottom--;
        
        //右边界 向上
        if(left <=right){
            for (int i = bottom; i >= top; i--) {
                res[index] =matrix[i][right];
            index ++;
            }
           right--;
            }
            
        //上边界 向左
         if(bottom >=top){
            for(int i =right ;i>=left ;i--)
            {
                res[index] = matrix[top][i];
                index ++;
            }
            top++;
        } 
    }
    return res;
}
// 合并公共区域
public int[][] mergeGrasslands (int[][] grasslands) {
    // write code here
    if (grasslands == null || grasslands.length == 0) {
        return new int[0][2];
    }
    List<int []> res =new ArrayList<>();
  for (int[] grassland : grasslands) {
    //前一块草地和当前这块草地没有交集
    if(res.isEmpty() || res.get(res.size()-1)[1]< grassland[0])
    {
        res.add(grassland);
    }
    else{
        res.get(res.size()-1)[1] =Math.max( res.get(res.size()-1)[1],grassland[1]);
    }
  }
    return res.toArray(new int[res.size()][2]);
}
//最长不重复子串
public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    Set<Character> set = new HashSet<>();
    int left = 0, right = 0, maxLen = 0;
    
    while (right < n) {
        if (!set.contains(s.charAt(right))) {
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        } else {
            set.remove(s.charAt(left));
            left++;
        }
    }
    return maxLen;
}
//递归链表颠倒
public ListNode reverseCows(ListNode head) {
        // 如果链表为空或只有一个节点，直接返回该节点
        if (head == null || head.next == null) {
            return head;
        }
        // 递归反转链表的其余部分
        ListNode reversedHead = reverseCows(head.next);
        // 将当前节点的next指针指向前一个节点，实现反转操作
        head.next.next = head;
        head.next = null;

        return reversedHead;
    }


    public static void main(String[] args) {
        int []nums={1,5,3,7,9,2,4,6,8,10};
        
    }
 
}