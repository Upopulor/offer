package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo637 {
	//给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>(); 
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
        	double kk = 0;
        	int size = q.size();
        	for(int i = q.size() ; i > 0 ; i--) {
        		TreeNode t = q.poll();
        		kk += t.val;
        		if(t.left!=null) q.add(t.left);
        		if(t.right!=null) q.add(t.right);
        	}
        	res.add((kk*1.0/size));	
        }
        return res;
    }
	//2dgui
	public List<Double> averageOfLevels2(TreeNode root) {
		List<Double> res = new ArrayList<Double>(); 
		List<Double> cnt = new ArrayList<Double>(); 
		if(root == null) return res;
		DiGUI(res , cnt , 0 , root);
		for(int i = 0 ; i < res.size() ; i ++) {
			res.set(i, res.get(i)/cnt.get(i));
		}
		return res;
	}
	private void DiGUI(List<Double> res, List<Double> cnt, int level, TreeNode root) {
		if(root == null) return;
		if(res.size() <= level) {
			res.add(0.0);
			cnt.add(0.0);
		}
		res.set(level, res.get(level)+root.val);
		cnt.set(level, cnt.get(level)+1);
		DiGUI(res , cnt , level+1 , root.left);
		DiGUI(res , cnt , level+1 , root.right);
	}
}
