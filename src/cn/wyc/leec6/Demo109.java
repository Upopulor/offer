package cn.wyc.leec6;

public class Demo109 {
	public TreeNode sortedListToBST(ListNode head) {
		//给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
        if(head==null) return null;
        return buildTree(head,null);
    }
	private TreeNode buildTree(ListNode head, ListNode tail) {
		if(head == tail) return null;
		ListNode slow=head,fast=head;
		while(fast!=tail&&fast.next!=tail) {
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode cur = new TreeNode(slow.val);
		cur.left = buildTree(head,slow);
		cur.right = buildTree(slow.next,tail);
		return cur;
	}
}
