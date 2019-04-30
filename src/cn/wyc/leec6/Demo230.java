package cn.wyc.leec6;

import java.util.Stack;

public class Demo230 {
	//����һ����������������дһ������ kthSmallest ���������е� k ����С��Ԫ�ء�
	//1 stack
	public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        int count = 0;
        Stack<TreeNode> s = new Stack<>();
        TreeNode p = root;
        while(p != null || !s.isEmpty()) {
        	while(p!=null) {
        		s.push(p);
        		p = p.left;
        	}
        	TreeNode t = s.pop();
        	count++;
        	if(count == k) return t.val;
        	p= t.right;
        }
        return -1;
    }
	//2 digui ����
	public int kthSmallest2(TreeNode root, int k) {
		if(root == null) return -1;
		return DiGUI(root , k);
	}
	private int DiGUI(TreeNode root, int k) {
		if(root == null) return -1;
		int val = DiGUI(root.left , k);
		if(k == 0) return val;
		if(--k == 0) return root.val;
		return DiGUI(root.right,k);
	}
}
