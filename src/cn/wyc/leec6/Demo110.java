package cn.wyc.leec6;

public class Demo110 {
	public boolean isBalanced(TreeNode root) {
		//����һ�����������ж����Ƿ��Ǹ߶�ƽ��Ķ�������
		//�����У�һ�ø߶�ƽ�����������Ϊ��
		//һ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������1
        if(root == null) return true;
        if(Math.abs(getDepth(root.left)-getDepth(root.right))>1) {
        	return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
	private int getDepth(TreeNode root) {
		if(root ==null) return 0;
		return 1+Math.max(getDepth(root.left), getDepth(root.right));
	}
}
