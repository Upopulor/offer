package cn.wyc.leec7;

public class Demo148 {
	public ListNode sortList(ListNode head) {
		//在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序
        if(head==null||head.next==null) return head;
        ListNode pre = head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null) {
        	pre = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        pre.next = null;
        return GuiBin(sortList(head),sortList(slow));
    }
	private ListNode GuiBin(ListNode t1, ListNode t2) {
		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy;
		while(t1!=null&&t2!=null) {
			if(t1.val < t2.val) {
				cur.next = t1;
				t1 = t1.next;
			}else {
				cur.next = t2;
				t2 = t2.next;
			}
			cur = cur.next;
		}
		if(t1 !=null) cur.next = t1;
		if(t2 !=null) cur.next = t2;
		return cur.next;
	}
}
