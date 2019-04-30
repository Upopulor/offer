package cn.wyc.leec6;

public class Demo108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
		//本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
        return buildTree(nums , 0 ,nums.length-1);
    }
	private TreeNode buildTree(int[] nums, int start, int end) {
		if(start > end) return null;
		int mid = start + (end - start)/2;
		TreeNode cur = new TreeNode(nums[mid]);
		cur.left = buildTree(nums , start , mid-1);
		cur.right = buildTree(nums, mid+1 , end);
		return cur;
	}
}
