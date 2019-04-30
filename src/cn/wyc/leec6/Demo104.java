package cn.wyc.leec6;

import java.util.LinkedList;
import java.util.Queue;

public class Demo104 {
	//给定一个二叉树，找出其最大深度
	public int maxDepth(TreeNode root) {
		//1
        //return root == null?0:(1+Math.max(maxDepth(root.left), maxDepth(root.right)));
        //2层层遍历
        if(root == null) return 0;
        int res = 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
        	res++;
        	for(int i = q.size() ; i > 0 ; i--) {
        		TreeNode t = q.poll();
        		if(t.left!=null) q.add(t.left);
        		if(t.right!=null) q.add(t.right);
        	}
        }
        return res;
    }
}
