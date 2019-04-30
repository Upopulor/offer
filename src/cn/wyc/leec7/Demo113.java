package cn.wyc.leec7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo113 {
	//����һ����������һ��Ŀ��ͣ��ҵ����дӸ��ڵ㵽Ҷ�ӽڵ�·���ܺ͵��ڸ���Ŀ��͵�·����
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<>();
		if(root == null) return res;
		DFS(res,out,root,sum);
		return res;
    }
	private void DFS(List<List<Integer>> res, List<Integer> out, TreeNode root, int sum) {
		if(root == null) return;
		List<Integer> tmp = new ArrayList<>(out);
		tmp.add(root.val);
		if(root.left==null&&root.right==null&&sum == root.val) {
			res.add(tmp);
		}
		DFS(res,tmp,root.left,sum-root.val);
		DFS(res,tmp,root.right,sum-root.val);
		tmp.remove(out.size());
	}
}
