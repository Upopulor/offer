package cn.wyc.leec;

import java.util.Arrays;
import java.util.HashMap;

public class Demo1 {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hh = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			hh.put(nums[i],i);
		}
		for(int i = 0 ; i < nums.length ; i++) {
			int kk = target - nums[i];
			if(hh.containsKey(kk)&&hh.get(kk)!=i) {
				return new int[] {i , hh.get(kk)};
			}
		}
        return null;
    }
	public static int[] twoSum2(int[] nums, int target) {
		for(int i = 0 ; i < nums.length-1 ; i++) {
			for(int j = i+1 ; j < nums.length ; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
    }
	public static void main(String[] args) {
		int[] kk = new int[] {3,3};
		int[] twoSum = twoSum(kk,6);
		System.out.println(Arrays.toString(twoSum));
	}
}
