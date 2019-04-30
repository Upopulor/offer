package cn.wyc.leec7;

public class Demo142 {
	//����һ��������������ʼ�뻷�ĵ�һ���ڵ㡣 ��������޻����򷵻� null
	public ListNode detectCycle(ListNode head) {
		if(head==null||head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if(fast == slow) break;
        }
        if(fast==null||fast.next==null) return null;
        slow = head;
        while(slow!=fast) {
        	slow = slow.next;
        	fast = fast.next;
        }
        return fast;
    }
}
