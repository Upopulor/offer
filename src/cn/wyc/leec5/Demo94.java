package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo94 {
	//����һ���������������������� ����
	//1
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        inorder(root,res);
        return res;
    }
	private static void inorder(TreeNode root, List<Integer> res) {
		if(root==null) return;
		if(root.left!=null) inorder(root.left,res);
		res.add(root.val);
		if(root.right!=null) inorder(root.right,res);
	}
	//2ʹ��ջ
	public static List<Integer> inorderTraversal2(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(p!=null || !stack.isEmpty()) {
        	while(p !=null) {
        		stack.push(p);
        		p = p.left;
        	}
        	TreeNode t  = stack.pop();
        	res.add(t.val);
        	p = t.right;
        }
        return res;
	}
	//3 ʹ��ջ 2
	public static List<Integer> inorderTraversal3(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(p!=null || !stack.isEmpty()) {
        	if(p !=null) {
        		stack.push(p);
        		p = p.left;
        	}else {
        		TreeNode t  = stack.pop();
            	res.add(t.val);
            	p = t.right;
        	}
        }
        return res;
	}
}
