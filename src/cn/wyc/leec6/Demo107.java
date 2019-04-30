package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo107 {
	//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			for(int i = q.size() ; i > 0 ; i--) {
				TreeNode t = q.poll();
				list.add(t.val);
				if(t.left != null) q.add(t.left);
				if(t.right != null) q.add(t.right);
			}
			res.add(0, list);
		}
		return res;
    }
	//2digui
	public List<List<Integer>> levelOrderBottom2(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		DiGUI(res,0,root);
		Collections.reverse(res);
		return res;
	}
	private void DiGUI(List<List<Integer>> res, int level, TreeNode root) {
		if(root == null) return;
		if(res.size() == level) {
			res.add(new ArrayList<Integer>());
		}
		res.get(level).add(root.val);
		if(root.left!=null) DiGUI(res,level+1,root.left);
		if(root.right!=null) DiGUI(res,level+1,root.right);
	}
}
