package cn.wyc.leec5;

public class Demo100 {
	//给定两个二叉树，编写一个函数来检验它们是否相同
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p == null && q != null)||(p != null && q==null)) return false;
        return cop(p ,q);
    }
	private boolean cop(TreeNode p, TreeNode q) {
		if(p==null && q == null) return true;
		if((p == null && q != null)||(p != null && q==null)) return false;
		if(p.val != q.val) return false;
		return cop(p.left ,q.left)&&cop(p.right ,q.right);
	}
}
