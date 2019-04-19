package cn.wyc.leec3;

public class Demo35 {
	//����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ��
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
