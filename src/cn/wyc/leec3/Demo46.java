package cn.wyc.leec3;

import java.util.ArrayList;
import java.util.List;

public class Demo46 {
	//给定一个没有重复数字的序列，返回其所有可能的全排列。
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		int[] visited = new int[nums.length];
		DFS(nums,0,visited,out,res);
		return res;
    }

	private static void DFS(int[] nums, int level, int[] visited, List<Integer> out, List<List<Integer>> res) {
		if(level == nums.length) {
			res.add(out);
			return;
		}
		for(int i = 0 ; i < nums.length ; i++) {
			if(visited[i] == 1) {
				continue;
			}
			visited[i] = 1;
			List<Integer> tmp = new ArrayList<Integer>(out);
			tmp.add(nums[i]);
			DFS(nums,level+1,visited,tmp,res);
			visited[i] = 0;
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> permute = permute(new int[] {1,2,3});
		System.out.println(permute);
	}
}
