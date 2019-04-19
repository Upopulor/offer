package cn.wyc.leec5;

public class Demo80 {
	//不会 Remember
	//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
	//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
	public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <= 2) return len;
        int pre = 0 , cur = 1 , count = 1;
        while(cur < len) {
        	if(nums[pre] == nums[cur] && count == 0) cur++;
        	else {
        		if(nums[pre] == nums[cur]) --count;
        		else count = 1;
        		nums[++pre] = nums[cur++];
        	}
        }
        return pre+1;
    }
	/**
	 * 这里允许最多重复的次数是两次，那么我们就需要用一个变量count来记录还允许有几次重复，
	 * count初始化为1，如果出现过一次重复，则count递减1，那么下次再出现重复，快指针直接
	 * 前进一步，如果这时候不是重复的，则count恢复1，由于整个数组是有序的，所以一旦出现不
	 * 重复的数，则一定比这个数大，此数之后不会再有重复项
	 */
}
