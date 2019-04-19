package cn.wyc.leec3;

import java.util.Arrays;

public class Demo31 {
	//ʵ�ֻ�ȡ��һ�����еĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�
	//�����������һ����������У��������������г���С�����У����������У�
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
