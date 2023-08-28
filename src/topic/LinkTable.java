package topic;

import java.util.ArrayList;
import java.util.HashMap;

public class LinkTable {
class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
    this.val = val;
    }
    }
    //反转链表
    public ListNode ReverseList (ListNode head) {
        // write code here
        if(head ==null) return null;
        ListNode pre =null;
        ListNode next =null;  
        while(head != null){
            next =head.next;
            head.next =pre;
            pre =head;
            head =next;
        }
        return pre;
    }

    //链表内指定区间反转
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if(head == null || m== n) return head;
        ListNode vhead,pre,start,cur;
        vhead =new ListNode(-1);
        vhead.next =head;
        pre = vhead;
        for(int  i = 0 ;i<m-1; i++){
            pre =pre.next;
        }
        start =pre.next;
        for(int i =0;i<n-m;i++){
            cur =start.next;
            start.next =cur.next;
            cur.next =pre.next;
            pre.next =cur;
        }
        return vhead.next;
    }
    
    //  链表中的节点每k个一组翻转
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        if(head == null||k<= 1 ||head.next ==null) return head;
        ListNode vhead =new ListNode(0);
        vhead.next =head;
        ListNode pre = vhead, cur = head, temp;
        int len = 0;
        while(head != null){
            len++;
            head =head.next;
        }
        for(int i = 0; i<len/k;i++){
            for(int j = 0 ;j<k-1;j++){
                temp =cur.next;
                cur.next =temp.next;
                temp.next =pre.next;
                pre.next =temp;
            }
            pre =cur;
            cur =cur.next;
        }
        return vhead.next;
    }


    //有序链表的合并
     public ListNode Merge (ListNode pHead1, ListNode pHead2) {
        // write code here
        ListNode newList =new ListNode(-1);
        ListNode head =newList;
        while(pHead1!=null && pHead2 !=null){
            if(pHead1.val<pHead2.val){
                newList.next =pHead1;
                newList =newList.next;
                pHead1=pHead1.next;
            }else{
                newList.next =pHead2;
                newList =newList.next;
                pHead2=pHead2.next;
            }
        }
        if(pHead1 != null) newList.next =pHead1;
        else  newList.next =pHead2;    
        
        return head.next;
    }
    //合并k个链表
     public ListNode mergeKLists (ArrayList<ListNode> lists) {
        // write code here
        if(lists.size() ==0 ) return null;
        if(lists.size() == 1) return lists.get(0);
        ListNode head =lists.get(0);
        for(int i =1 ;i<lists.size();i++){
            head =Merge(head, lists.get(i));
        }
        return head;
    }

    //判断链表中是否有环
    public boolean hasCycle(ListNode head) {
        ListNode fast  =head;
        ListNode slow  =head;
        while(fast != null && fast.next != null){
            fast =fast.next.next;
            slow =slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashMap map =new HashMap<>();
        if(pHead == null) return null;
        while(pHead != null){
            if(map.containsKey(pHead)){
                return pHead;
            }
            map.put(pHead, pHead.val);
            pHead =pHead.next;
        }
        return null;
    }
    //链表中倒数最后k个结点
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        int length = 0;
        ListNode head = pHead;
        while(head!=null){
            length ++;
            head =head.next;
        }
        if(length >=k){
            for(int  i =0;i<length -k ;i++){
                pHead = pHead.next;
            } 
            return pHead;
        }
        return null;
    }

    //删除链表的倒数第n个节点
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode res = new ListNode(-1);
        res.next = head;
        //当前节点
        ListNode cur = head;
        //前序节点
        ListNode pre = res;
        ListNode fast = head;
        //快指针先行n步
        while(n != 0){
            fast = fast.next;
            n--;
        }
        //快慢指针同步，快指针到达末尾，慢指针就到了倒数第n个位置
        while(fast != null){
            fast = fast.next;
            pre = cur;
            cur = cur.next;
        }
        //删除该位置的节点
        pre.next = cur.next;
        //返回去掉头
        return res.next;
    }

    //两个链表公共节点
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2) {
            l1 = (l1 == null) ? pHead2 : l1.next;
            l2 = (l2 == null) ? pHead1 : l2.next;
        }
        return l1;
    }

    // 链表求和
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if(head1 ==null) return head2;
        if(head2 ==null) return head1;
        head1 = ReverseList(head1);
        head2 = ReverseList(head2);
        int tmp =0;
        ListNode head = new ListNode(-1);
        ListNode nHead = head;
        while(head1 != null || head2 != null){
            int res = tmp;
            if(head1 != null){
                res += head1.val;
                head1 =head1.next;
            }
            if(head2 != null){
                res += head2.val;
                head2 =head2.next;
            }
            tmp =res/10;
            nHead.next =new ListNode(res%10);
            nHead = nHead.next;
        }
        if(tmp !=0) nHead.next =new ListNode(tmp);
        head = ReverseList(head.next);
        return head;
    }
}
