package cn.wyc.leec;

import java.util.Stack;

public class Demo234 {
	public static boolean isPalindrome(ListNode head) {
        if(head == null||head.next == null) {
        	return true;
        }
        Stack<Integer> stack = new Stack<Integer>();
        ListNode fast = head;
        ListNode slow = head;
        stack.push(head.val);
        while(slow.next!=null&&(fast.next!=null&&fast.next.next!=null)) {
        	slow = slow.next;
        	fast = fast.next.next;
        	stack.push(slow.val);
        }
        if(fast.next==null) { //。奇数时候：slow到3，fast到5，所以要去掉中间的一个，即出栈一个。
        	stack.pop();
        }
        while(slow.next != null) {
        	slow = slow.next;
        	int temp = stack.pop();
        	if(temp != slow.val) {
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode a2 = new ListNode(0);
		ListNode a3 = new ListNode(0);
		//ListNode a4 = new ListNode(1);
		a.next = a2;
		a2.next = a3;
		//a3.next = a4;
		boolean palindrome = isPalindrome(a);
		System.out.println(palindrome);
	}
}
