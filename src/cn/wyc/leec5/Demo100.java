package cn.wyc.leec5;

public class Demo100 {
	//������������������дһ�����������������Ƿ���ͬ
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
