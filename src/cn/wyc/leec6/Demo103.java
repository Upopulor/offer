package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Demo103 {
	//给定一个二叉树，返回其节点值的锯齿形层次遍历
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		Stack<TreeNode> q = new Stack<>();
		Stack<TreeNode> q2 = new Stack<>();
		q.add(root);
		
		while(!q.isEmpty()||!q2.isEmpty()) {
			List<Integer> list1 = new ArrayList<>();
			while(!q.isEmpty()) {
				TreeNode t = q.pop();
				list1.add(t.val);
				if(t.left!= null) q2.add(t.left);
				if(t.right!= null) q2.add(t.right);
			}
			if(!list1.isEmpty()) res.add(list1);  //如果使用一个list 则clear时res里面也会清空
			//list.clear();
			List<Integer> list2 = new ArrayList<>();
			while(!q2.isEmpty()) {
				TreeNode t2 = q2.pop();
				list2.add(t2.val);
				if(t2.right!= null) q.add(t2.right);
				if(t2.left!= null) q.add(t2.left);
				
			}
			if(!list2.isEmpty()) res.add(list2);
			//list.clear();
		}
		return res;
    }
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(2);
		TreeNode treeNode4 = new TreeNode(3);
		TreeNode treeNode5 = new TreeNode(4);
		TreeNode treeNode6 = new TreeNode(4);
		TreeNode treeNode7 = new TreeNode(3);
		treeNode.left = treeNode2;
		treeNode.right = treeNode3;
		treeNode2.left = treeNode4;
		treeNode2.right = treeNode5;
		treeNode3.left = treeNode6;
		treeNode3.right = treeNode7;
		List<List<Integer>> zigzagLevelOrder = zigzagLevelOrder(treeNode);
	}
}
