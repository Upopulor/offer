package cn.wyc.leec6;

public class Demo110 {
	public boolean isBalanced(TreeNode root) {
		//给定一个二叉树，判断它是否是高度平衡的二叉树。
		//本题中，一棵高度平衡二叉树定义为：
		//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1
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
