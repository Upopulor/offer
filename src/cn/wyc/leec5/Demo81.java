package cn.wyc.leec5;

public class Demo81 {
	//���谴�����������������Ԥ��δ֪��ĳ�����Ͻ�������ת��
	//��дһ���������жϸ�����Ŀ��ֵ�Ƿ�����������С������ڷ��� true�����򷵻� false
	public static boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int left = 0 , right = nums.length-1;
        while(left <= right) {
        	int mid = left + (right - left)/2;
        	if(nums[mid] == target) return true;
        	else if(nums[mid] < nums[right]) {
        		if(nums[mid] < target && target <= nums[right]) left = mid+1;
        		else right = mid-1;
        	}else if(nums[mid] > nums[right]) {
        		if(nums[mid]>target && target >= nums[left]) right = mid-1;
        		else left = mid+1;
        	}else {
        		right--;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(search(new int[] {3,1},1));
	}
}
