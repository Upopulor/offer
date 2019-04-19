package cn.wyc.leec3;

public class Demo35 {
	//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
	public static int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0) {
        	return -1;
        }
        int left = 0 , right = nums.length-1;
        while(left < right) {
        	int mid = left + (right  - left)/2;
        	if(target > nums[mid]) {
        		left = mid+1;
        	}else {
        		right = mid;
        	}
        }
        if(nums[right] >= target) {
        	return right;
        }else {
        	return right+1;
        }       
    }
	public static void main(String[] args) {
		int searchInsert = searchInsert(new int[] {1,3,5,6},0);
		System.out.println(searchInsert);
	}
}
