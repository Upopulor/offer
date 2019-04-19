package cn.wyc.leec3;

import java.util.Arrays;

public class Demo31 {
	//实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
	//如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）
	//32 -> 46permute
	public static void nextPermutation(int[] nums) {
		int len = nums.length;
        if(len <= 0) return;
        int i=0,j=0;
        for(i = len-2 ; i >=0 ; i--) {
        	if(nums[i+1] > nums[i]) {
        		for(j = len - 1 ; j > i ; j--) {
        			if(nums[j] > nums[i]) {
        				break;
        			}
        		}
        		int temp = nums[j];
        		nums[j] = nums[i];
        		nums[i] = temp;
        		Arrays.sort(nums, i+1, len);
        		return;
        	}
        }
        Arrays.sort(nums);
    }
	public static void main(String[] args) {
		nextPermutation(new int[] {1,2,3});
	}
}
