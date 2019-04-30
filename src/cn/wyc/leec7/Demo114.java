package cn.wyc.leec7;

public class Demo114 {
	
	public void flatten(TreeNode root) {
        if(root == null) return ;
        if(root.left!=null) flatten(root.left);
        if(root.right!=null) flatten(root.right);
        TreeNode t = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right!=null) root= root.right;
        root.right = t;
    }
}
