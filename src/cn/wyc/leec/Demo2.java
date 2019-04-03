package cn.wyc.leec;

public class Demo2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int carry = 0;
        while(l1 != null || l2 != null) {
        	int d1 = l1==null?0:l1.val;
        	int d2 = l2==null?0:l2.val;
        	int sum = d1 + d2 + carry;
        	carry = sum>=10?1:0;
        	cur.next = new ListNode(sum%10);
        	cur = cur.next;
        	if(l1 != null) l1 = l1.next;
        	if(l2 != null) l2 = l2.next;
        }
        if(carry == 1) {
        	cur.next = new ListNode(1);
        }
        return res.next;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		
		ListNode k1 = new ListNode(5);
		ListNode k2 = new ListNode(6);
		ListNode k3 = new ListNode(4);
		k1.next = k2;
		k2.next = k3;
		ListNode node = addTwoNumbers(n1,k1);
		System.out.println(node);
	}
	/**
	 * �㷨�ܼ򵥣��������������Ҳ���ѣ����ǽ���һ��������Ȼ�����������������ͷ����ߣ��ÿ������
	 * �ӣ����һ���½ڵ㵽��������档Ϊ�˱���������������ͬʱΪ�գ����ǽ���һ��dummy��㣬��������
	 * ��������ɵ��½�㰴˳��ӵ�dummy���֮������dummy��㱾���ܱ䣬����������һ��ָ��cur��
	 * ָ������������һ����㡣�ã����Կ�ʼ��������������ˣ������þͺ������λ������Ŀ�ͷ��������
	 * �ǿ����ڱ��������ͬʱ���ӵ͵��ߵ�˳��ֱ����ӡ�whileѭ������������������ֻҪ��һ����Ϊ���У���
	 * ���������Ϊ�գ�����������ȡ��ǰ���ֵ��ʱ�����ж�һ�£���Ϊ����ȡ0������ȡ���ֵ��Ȼ���������
	 * ��ֵ��ӣ�ͬʱ��Ҫ���Ͻ�λcarry��Ȼ�����carry��ֱ�� sum/10 ���ɣ�Ȼ���� sum%10 Ϊֵ����һ��
	 * �½�㣬����cur���棬Ȼ��cur�ƶ�����һ����㡣֮���ٸ���������㣬�����ڣ���ָ����һ��λ�á�while
	 * ѭ���˳�֮�����λ�Ľ�λ����Ҫ������⴦��һ�£���carryΪ1�����ٽ�һ��ֵΪ1�Ľ��
	 */
}
