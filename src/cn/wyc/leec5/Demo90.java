package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo90 {
	//给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> out = new ArrayList<Integer>();
        if(nums.length == 0) return res;
        Arrays.sort(nums);
        DFS(res , out , 0 , nums);
        return res;
    }
	private static void DFS(List<List<Integer>> res, List<Integer> out, int level, int[] nums) {
		res.add(out);
		for(int i = level ; i < nums.length ; i++) {
			List<Integer> tmp = new ArrayList<Integer>(out);
			tmp.add(nums[i]);
			DFS(res , tmp , i+1 , nums);
			while(i+1<nums.length&&nums[i]==nums[i+1]) i++;
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> dup = subsetsWithDup(new int[] {1,2,2});
	}
}
