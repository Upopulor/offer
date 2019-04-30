package cn.wyc.leec7;

public class Demo148 {
	public ListNode sortList(ListNode head) {
		//�� O(n log n) ʱ�临�ӶȺͳ������ռ临�Ӷ��£��������������
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
