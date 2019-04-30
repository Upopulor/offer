package cn.wyc.leec6;

import java.util.LinkedList;
import java.util.Queue;

public class Demo111 {
	//给定一个二叉树，找出其最小深度
	public int minDepth(TreeNode root) {
		//1
        if(root == null) return 0;
        if(root.left == null) return 1+minDepth(root.right);
        if(root.right == null) return 1+minDepth(root.left);
        return 1+Math.min(minDepth(root.left), minDepth(root.right));
    }
	//2
	public int minDepth2(TreeNode root) {
		if(root == null) return 0;
		int res = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			res ++;
			for(int i = q.size() ; i > 0 ; i--) {
				TreeNode t = q.poll();
				if(t.left==null&&t.right==null) return res;
				if(t.left!=null) q.add(t.left);
				if(t.right!=null) q.add(t.right);
			}
		}
		return -1;
	}
}
