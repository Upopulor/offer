package cn.wyc.leec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo39 {
	//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		Arrays.sort(candidates); //排序，下面判断大小可提前退出
		combinationSumDFS(candidates,target,0,out,res);
		return res;
    }
	private static void combinationSumDFS(int[] candidates,int target,int start,
										List<Integer> tmp,List<List<Integer>> res) {
		if(target == 0) {
			res.add(tmp);
			return;
		}
		if(target < candidates[0]) {  //由于排序了，当小于数组最小即可退出，不用为0
			return;
		}
		//从start开始，判断条件为target>=candidates[i]，否则会有重复
		for(int i = start ; i < candidates.length&&target>=candidates[i] ; i++) {
			List<Integer> list = new ArrayList<Integer>(tmp);
			list.add(candidates[i]);
			combinationSumDFS(candidates,target-candidates[i],i,list,res);
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> sum = combinationSum(new int[] {2,3,6,7} , 7);
		System.out.println(sum);
	}
}
