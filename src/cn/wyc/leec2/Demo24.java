package cn.wyc.leec2;

public class Demo24 {
	//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
	//给定 1->2->3->4, 你应该返回 2->1->4->3.
	public ListNode swapPairs(ListNode head) {
		ListNode org = new ListNode(-1);
		ListNode pre = org;
		pre.next = head;  //pre->1(head)->2->3->4
		while(pre.next!= null && pre.next.next!=null) {
			ListNode t = pre.next.next; //Node(t) = 2->3->4
			pre.next.next = t.next;     //pre->1(head)->3->4
			t.next = pre.next;			//t(2)->1(head)->3->4
			pre.next = t;				//pre->t(2)->1(head)->3->4
			pre = t.next;				//为下一次调整pre 
		}
        return org.next;
    }
	/**
	 * digui
	 * class Solution {
			public:
			    ListNode* swapPairs(ListNode* head) {
			        if (!head || !head->next) return head;
			        ListNode *t = head->next;
			        head->next = swapPairs(head->next->next);
			        t->next = head;
			        return t;
			    }
			};
	 */
}
