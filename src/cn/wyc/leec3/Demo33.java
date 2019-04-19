package cn.wyc.leec3;

public class Demo33 {
	/**
	 * 0　　1　　2　　 4　　5　　6　　7
		7　　0　　1　　 2　　4　　5　　6
		6　　7　　0　　 1　　2　　4　　5
		5　　6　　7　　 0　　1　　2　　4
		4　　5　　6　　7　　0　　1　　2
		2　　4　　5　　6　　7　　0　　1
		1　　2　　4　　5　　6　　7　　0
		二分搜索法的关键在于获得了中间数后，判断下面要搜索左半段还是右半段，我们观察
		上面红色的数字都是升序的，由此我们可以观察出规律，如果中间的数小于最右边的数
		，则右半段是有序的，若中间数大于最右边数，则左半段是有序的，我们只要在有序的
		半段里用首尾两个数组来判断目标值是否在这一区域内，这样就可以确定保留哪半边了
	 */
	public int search(int[] nums, int target) {
		if(nums.length == 0) return 0;
		int left = 0 , right = nums.length-1;
		while(left <= right) {
			int mid = left + (right-left)/2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < nums[right]) {  //有序的在右
				if(nums[mid] < target && nums[right] >= target) left=mid+1;  //在右区间
				else right = mid-1;											 //在左区间
			}else {  //有序的在左
				if(nums[left] <= target && nums[mid] > target) right=mid-1;   //在左区间
				else left = mid+1;                                           //在右区间
			} 
		}
        return -1;
    }
}
