package cn.wyc.leec7;

import java.util.Stack;

public class Demo112 {
	//����һ����������һ��Ŀ��ͣ��жϸ������Ƿ���ڸ��ڵ㵽Ҷ�ӽڵ��·��������·�������нڵ�ֵ��ӵ���Ŀ���
	//112 --> 113 --> 437
	//1 digui
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left==null&&root.right==null&&root.val == sum) return true;
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
	//2 stack
	public boolean hasPathSum2(TreeNode root, int sum) {
		if(root == null) return false;
		Stack<TreeNode> s= new Stack<>();
		s.add(root);
		while(!s.isEmpty()) {
			TreeNode t = s.pop();
			if(t.left==null&&t.right==null) {
				if(t.val==sum) return true;
			}
			if(t.left!=null) {
				t.left.val +=t.val;
				s.push(t.left);
			}
			if(t.right!=null) {
				t.right.val+=t.val;
				s.push(t.right);	
			}
		}
		return false;
	}
}
