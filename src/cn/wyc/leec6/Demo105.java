package cn.wyc.leec6;

public class Demo105 {
	//根据一棵树的前序遍历与中序遍历构造二叉树 -->106
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder , 0 ,preorder.length-1,inorder,0,inorder.length-1);
    }
	private TreeNode buildTree(int[] preorder, int pstart, int pend, 
							   int[] inorder, int istart, int iend) {
		if(pstart > pend || istart > iend) return null;
		int i = 0 ;
		for(i = istart ; i <= iend ; i++) {
			if(preorder[pstart] == inorder[i]) break;
		}
		TreeNode cur = new TreeNode(preorder[pstart]);
		cur.left = buildTree(preorder,pstart+1,pstart-istart+i,inorder,istart,i-1);
		cur.right = buildTree(preorder,pstart-istart+i+1,pend,inorder,i+1,iend);
		return cur;
	}
}
