package cn.wyc.leec7;

public class Demo143 {
	public static void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null&&fast.next.next!=null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next=null; //important  如果不加这个，会超时，可能能节约资源
        //2
        ListNode pre = null;
        ListNode next = null;
        ListNode head2 = mid;
        while(head2!=null) {
        	next = head2.next;
        	head2.next=pre;
        	pre = head2;
        	head2 = next;
        }
        //3
        //---pre
        ListNode begin = head;
        while(begin!=null&&pre!=null) {
        	ListNode nextBegin = begin.next, preNext = pre.next;
        	begin.next = pre;
        	pre.next = nextBegin;
        	begin = nextBegin;
        	pre = preNext;
        }
    }
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		reorderList(node1);
	}
}
