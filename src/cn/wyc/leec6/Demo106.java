package cn.wyc.leec6;

public class Demo106 {
	//����һ������������������������������
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
	private TreeNode buildTree(int[] inorder, int istart, int iend, 
							   int[] postorder, int pstart, int pend) {
		if(istart > iend || pstart > pend) return null;
		TreeNode cur = new TreeNode(postorder[pend]);
		int i = 0;
		for(i = istart ; i <= iend ; i++) {
			if(inorder[i] == postorder[pend]) break;
		}
		cur.left=buildTree(inorder,istart,i-1,postorder,pstart,pstart-istart+i-1);
		cur.right=buildTree(inorder,i+1,iend,postorder,pstart-istart+i,pend-1);
		return cur;
	}
}
