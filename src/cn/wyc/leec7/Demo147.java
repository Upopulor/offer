package cn.wyc.leec7;

public class Demo147 {
	public static ListNode insertionSortList(ListNode head) {
        if(head==null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(head!=null) {
        	ListNode t = head.next;
        	cur = dummy;
        	while(cur.next!=null&&cur.next.val<=head.val) {
        		cur = cur.next;
        	}
        	head.next = cur.next;
        	cur.next = head;
        	head = t;
        }
        return dummy.next;
    }
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		System.out.println(node==null); 
		System.out.println(node.next==null); 
		insertionSortList(node);
	}
}
