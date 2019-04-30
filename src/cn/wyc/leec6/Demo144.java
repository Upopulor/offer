package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Demo144 {
	//给定一个二叉树，返回它的 前序 遍历
	//1递归1
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
        if(root== null) return res;
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
    }
	//2 递归2
	public List<Integer> preorderTraversal2(TreeNode root) {
		List<Integer> res = new ArrayList<>();
        if(root== null) return res;
        DiGUI(root,res);
        return res;
	}
	private void DiGUI(TreeNode root, List<Integer> res) {
		if(root == null) return ;
		res.add(root.val);
		if(root.left!=null) DiGUI(root.left,res);
		if(root.right!=null) DiGUI(root.right,res);
	}
	//3 stack
	public List<Integer> preorderTraversal3(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if(root == null)  return res;
		Stack<TreeNode> q = new Stack<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode t = q.pop();
			res.add(t.val);
			if(t.right!=null) q.push(t.right);
			if(t.left!=null) q.push(t.left);
			
		}
		return res;
	}
}


