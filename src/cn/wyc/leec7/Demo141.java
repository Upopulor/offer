package cn.wyc.leec7;

import java.util.HashSet;
import java.util.Set;

public class Demo141 {
	//给定一个链表，判断链表中是否有环
	//11
	public boolean hasCycle0(ListNode head) {
		if(head==null||head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if(fast == slow) return true;
        }
        return false;
	}
	public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(slow!=fast) {
        	if(fast==null||fast.next==null) return false;
        	slow = slow.next;
        	fast.next = fast.next.next;
        }
        return true;
    }
	public boolean hasCycle2(ListNode head) {
		if(head==null||head.next==null) return false;
		Set<ListNode> set = new HashSet<ListNode>();
		while(head.next!=null) {
			if(set.contains(head)) return true;
			else set.add(head);
			head = head.next;
		}
		return false;
	}
}
