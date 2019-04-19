package cn.wyc.leec4;

public class Demo61 {
	//����һ��������ת����������ÿ���ڵ������ƶ� k ��λ�ã����� k �ǷǸ���
	//61-->189
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode cur = head;
        int n = 1 ; 
        while(cur.next!=null) {
        	cur = cur.next;
        	n++;
        }
        cur.next = head;
        int m = n - k%n;
        for(int i = 0 ; i < m ; i ++) {
        	cur = cur.next;
        }
        ListNode newNode = cur.next;
        cur.next = null;
        return newNode;
    }
}
