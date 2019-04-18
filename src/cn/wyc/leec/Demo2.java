package cn.wyc.leec;

public class Demo2 {
	/**
	 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
		输出：7 -> 0 -> 8
		原因：342 + 465 = 807
	 */
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
	 * 算法很简单，链表的数据类型也不难，就是建立一个新链表，然后把输入的两个链表从头往后撸，每两个相
	 * 加，添加一个新节点到新链表后面。为了避免两个输入链表同时为空，我们建立一个dummy结点，将两个结
	 * 点相加生成的新结点按顺序加到dummy结点之后，由于dummy结点本身不能变，所以我们用一个指针cur来
	 * 指向新链表的最后一个结点。好，可以开始让两个链表相加了，这道题好就好在最低位在链表的开头，所以我
	 * 们可以在遍历链表的同时按从低到高的顺序直接相加。while循环的条件两个链表中只要有一个不为空行，由
	 * 于链表可能为空，所以我们在取当前结点值的时候，先判断一下，若为空则取0，否则取结点值。然后把两个结
	 * 点值相加，同时还要加上进位carry。然后更新carry，直接 sum/10 即可，然后以 sum%10 为值建立一个
	 * 新结点，连到cur后面，然后cur移动到下一个结点。之后再更新两个结点，若存在，则指向下一个位置。while
	 * 循环退出之后，最高位的进位问题要最后特殊处理一下，若carry为1，则再建一个值为1的结点
	 */
}
