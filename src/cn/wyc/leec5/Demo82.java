package cn.wyc.leec5;

public class Demo82 {
	//����һ����������ɾ�����к����ظ����ֵĽڵ㣬ֻ����ԭʼ������ û���ظ����� ������
	public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        dummy.next = head;
        while(pre.next != null) {
        	ListNode cur = pre.next;
        	while(cur.next!=null&&cur.val == cur.next.val) {
        		cur = cur.next;
        	}
        	if(pre.next != cur) pre.next = cur.next;
        	else pre = pre.next;
        }
        return dummy.next;
    }
	public static void main(String[] args) {
		ListNode k1 = new ListNode(1);
		ListNode k2 = new ListNode(1);
		ListNode k3 = new ListNode(1);
		ListNode k4 = new ListNode(2);
		ListNode k5 = new ListNode(3);
		k1.next = k2;
		k2.next = k3;
		k3.next = k4;
		k4.next = k5;
		ListNode delete = deleteDuplicates(k1);
		while(delete.next!=null) {
			System.out.println(delete.val);
			delete = delete.next;
		}
		System.out.println(delete.val);
	}
}
