package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo78 {
	//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> out = new ArrayList<Integer>();
        if(nums.length == 0) return res;
        Arrays.sort(nums);
        DFS(res , out , 0 , nums);
        return res;
    }

	private static void DFS(List<List<Integer>> res, List<Integer> out, int level, int[] nums) {
		res.add(out);
		for(int i = level ; i < nums.length ; i ++) {
			List<Integer> tmp = new ArrayList(out);
			tmp.add(nums[i]);
			DFS(res , tmp , i+1 , nums);
		}
	}
	//2非递归 未完成
	public static List<List<Integer>> subsets2(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length ;i++) {
			int size = i;
			List<Integer> tmp = new ArrayList();
			for(int j = 0 ;j < size ; j++) {
				tmp.add(nums[j]);
				res.add(tmp);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		List<List<Integer>> subsets = subsets2(new int[] {1,2,3});
	}
}
