package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo429 {
	//给定一个 N 叉树，返回其节点值的层序遍历
	//1
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
        	List<Integer> list = new ArrayList<>();
        	for(int i = q.size() ; i > 0 ; i--) {
        		Node t = q.poll();
        		list.add(t.val);
        		if(t.children!=null) {
        			for(Node child : t.children) {
        				q.add(child);
        			}
        		}
        	}
        	res.add(list);
        }
        return res;
    }
	//2
	public List<List<Integer>> levelOrder2(Node root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		DiGUI(root , res , 0);
		return res;
	}
	private void DiGUI(Node root, List<List<Integer>> res, int level) {
		if(root == null) return;
		if(res.size() <= level) {
			res.add(new ArrayList<Integer>());
		}
		res.get(level).add(root.val);
		for(Node child : root.children) {
			DiGUI(child , res , level+1);
		}
	}
}
