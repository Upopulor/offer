package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo145 {
	//给定一个二叉树，返回它的 后序 遍历
	
	//1 stack
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
        	TreeNode t = s.pop();
        	res.add(0,t.val);
        	if(t.left!=null) s.push(t.left);
        	if(t.right!=null) s.push(t.right);
        }
        return res;
    }
}
