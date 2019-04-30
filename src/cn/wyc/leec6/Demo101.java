package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo101 {
	//给定一个二叉树，检查它是否是镜像对称的。
	//1递归
	public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root,root);
	}
	private static boolean isMirror(TreeNode root, TreeNode root2) {
		if(root == null && root2 == null) return true;
		if(root == null || root2 == null) return false;
		return (root.val == root2.val)&&(isMirror(root.left, root2.left))
				&&isMirror(root.right, root2.right);
	}
	//2队列
	public static boolean isSymmetric2(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode t1 = queue.poll();
			TreeNode t2 = queue.poll();
			if(t1 == null && t2 == null) continue;
			if(t1 == null || t2 == null) return false;
			if(t1.val != t2.val) return false;
			queue.add(t1.left);
			queue.add(t2.right);
			queue.add(t1.right);
			queue.add(t2.left);
		}
		return true;
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
		System.out.println(isSymmetric(treeNode));
	}
}
