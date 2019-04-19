package cn.wyc.leec5;

public class Demo83 {
	//����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ��
	public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode cur = head;
        while(cur.next!=null&&cur.next.next!=null) {
        	if(cur.val == cur.next.val) {
        		cur.next = cur.next.next;
        	}else {
        		cur = cur.next;
        	}
        	
        }
        if(cur.next!=null&&cur.val==cur.next.val) {
        	cur.next = null;
        }
        return head;
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
