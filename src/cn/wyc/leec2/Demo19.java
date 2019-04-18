package cn.wyc.leec2;

import cn.wyc.leec2.ListNode;

public class Demo19 {
	//删除链表倒数第n个
	//-->26
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null || n == 0) return head;
		ListNode node = head;
		while(node!=null) {
			n--;
			node = node.next;
		}
		if(n == 0) {
			return head.next;
		}else if(n < 0) {
			node = head;
			while(++n!=0) {
				node = node.next;
			}
			node.next = node.next.next;
		}
        return head;
    }
}
