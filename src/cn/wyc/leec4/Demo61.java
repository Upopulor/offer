package cn.wyc.leec4;

public class Demo61 {
	//给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数
	//61-->189
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode cur = head;
        int n = 1 ; 
        while(cur.next!=null) {
        	cur = cur.next;
        	n++;
        }
        cur.next = head;
        int m = n - k%n;
        for(int i = 0 ; i < m ; i ++) {
        	cur = cur.next;
        }
        ListNode newNode = cur.next;
        cur.next = null;
        return newNode;
    }
}
