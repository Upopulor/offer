package cn.wyc.leec3;

import java.util.Arrays;

public class Demo34 {
	//����һ�������������е��������� nums����һ��Ŀ��ֵ target���ҳ�����Ŀ��ֵ�������еĿ�ʼλ�úͽ���λ��
	public static int[] searchRange(int[] nums, int target) {
		int[] res = new int[] {-1,-1};
		if(nums == null ||nums.length == 0) {
			return res;
		}
        int left = 0 , right = nums.length-1;
        while(left < right) {
        	int mid = left + (right - left)/2;
        	if(nums[mid] < target) {
        		left = mid+1;
        	}else {
        		right = mid;
        	}
        }
        if(nums[right] != target) {
        	return res;
        }
        res[0] = right;
        right = nums.length;  //not lenght - 1
        while(left < right) {
        	int mid = left + (right - left)/2;
        	if(nums[mid] <= target) {   // is <=
        		left = mid+1;
        	}else {
        		right = mid;
        	}
        }
        res[1] = left - 1;    //left-1
        return res;
    }
	public static void main(String[] args) {
		int[] searchRange = searchRange(new int[] {1},1);
		System.out.println(Arrays.toString(searchRange));
	}
}
