package cn.wyc.leec6;

public class Demo108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		//��һ�������������е��������飬ת��Ϊһ�ø߶�ƽ�������������
		//�����У�һ���߶�ƽ���������ָһ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������ 1��
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
