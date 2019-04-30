package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo102 {
	//102 --> 107 --> 637 --> 104 -->111 -->559 -->429
	// --> 144 -->589 -->590 --> 145 -->230
	//����һ���������������䰴��α����Ľڵ�ֵ�� �������أ������ҷ������нڵ㣩��
	//1queue
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			for(int i = q.size() ; i > 0 ; i--) {
				TreeNode t= q.poll();
				list.add(t.val);
				if(t.left!= null) q.add(t.left);
				if(t.right!= null) q.add(t.right);
			}
			res.add(list);
		}
		return res;
    }
	//2�ݹ�
	public List<List<Integer>> levelOrder2(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		DiGUI(res,0,root);
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
