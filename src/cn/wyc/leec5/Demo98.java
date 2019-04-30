package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.List;

public class Demo98 {
	/**
	 * ����һ�����������ж����Ƿ���һ����Ч�Ķ�����������
		����һ��������������������������
		�ڵ��������ֻ����С�ڵ�ǰ�ڵ������
		�ڵ��������ֻ�������ڵ�ǰ�ڵ������
		�������������������������Ҳ�Ƕ���������
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
	//2���� ��<=��ʱ������
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
