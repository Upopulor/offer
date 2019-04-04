package cn.wyc.leec2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo18 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums == null) return res;
		int len = nums.length;
		Arrays.sort(nums);
		for(int i = 0 ; i < len-3 ; i++) {
			if(i > 0 && nums[i]==nums[i-1]) continue;
			for(int j = i+1 ; j < len - 2 ; j++) {
				if(j > i+1 && nums[j] == nums[j-1]) continue; // j > i+1 不会跳过i之后的第一个相同的数字了
				int left = j + 1 , right = len - 1;
				while(left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if(sum == target) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[left]);
						list.add(nums[right]);
						res.add(list);
						while(left < right && nums[left] == nums[left+1]) left++;
						while(right > left && nums[right] == nums[right-1]) right--;
						left++;
						right--;
					}else if(sum < target) {
						left++;
					}else {
						right--;
					}
				}
			}
		}
        return res;
    }
	public static void main(String[] args) {
		int[] ss = new int[] {0,0,0,0};
		List<List<Integer>> fourSum = fourSum(ss,0);
		System.out.println(fourSum);
	}
}
