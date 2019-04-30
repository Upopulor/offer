package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.List;

public class Demo98 {
	/**
	 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
		假设一个二叉搜索树具有如下特征：
		节点的左子树只包含小于当前节点的数。
		节点的右子树只包含大于当前节点的数。
		所有左子树和右子树自身必须也是二叉搜索树
	 */
	//1
	public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return valid(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
	private boolean valid(TreeNode root, long minValue, long maxValue) {
		if(root == null) return true;
		if(root.val <= minValue || root.val >= maxValue) return false;
		return valid(root.left , minValue , root.val)&&
				valid(root.right , root.val , maxValue);
	}
	//2中序 左<=中时不可用
	public boolean isValidBST2(TreeNode root) {
		if(root == null) return true;
		List<Integer> list = new ArrayList<Integer>();
		zhong(root , list);
		for(int i = 0 ; i < list.size()-1 ; i ++) {
			if(list.get(i)>=list.get(i+1)) return false;
		}
		return true;
	}
	private void zhong(TreeNode root, List<Integer> list) {
		if(root == null) return;
		zhong(root.left,list);
		list.add(root.val);
		zhong(root.right,list);
	}
}
