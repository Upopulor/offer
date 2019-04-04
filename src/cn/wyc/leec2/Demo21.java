package cn.wyc.leec2;
public class Demo21 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null&&l2==null) return null;
		ListNode dur = new ListNode(-1);
		ListNode cur = dur;
		while(l1!=null&&l2!=null) {
			if(l1.val < l2.val) {
				cur.next = l1;
				l1 = l1.next;
			}else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		cur.next = (l1 != null) ? l1 : l2;
        return dur.next;
    }
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(3);
		ListNode node7 = new ListNode(5);
		node5.next = node6;
		node6.next = node7;
		ListNode mergeTwoLists = mergeTwoLists(node1,node5);
		System.out.println(mergeTwoLists);
	}
}
