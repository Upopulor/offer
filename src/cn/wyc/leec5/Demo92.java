package cn.wyc.leec5;

public class Demo92 {
	//bie
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode dummy = new ListNode(-1), pre = dummy;
        dummy.next = head;
        for (int i = 0; i < m - 1; ++i) pre = pre.next;
        ListNode cur = pre.next;
        for (int i = m; i < n; ++i) {
            ListNode t = cur.next;
            cur.next = t.next;
            t.next = pre.next;
            pre.next = t;
        }
        return dummy.next;
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
		ListNode res = reverseBetween(node1,2,4);
		while(res!= null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
}
