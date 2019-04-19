package cn.wyc.leec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo40 {
	//给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		Arrays.sort(candidates);
		DSF(candidates,target,0,out,res);
		return res;
    }
	private static void DSF(int[] candidates, int target, int start, List<Integer> out, List<List<Integer>> res) {
		if(target == 0) {
			res.add(out);
			return;
		}else if(target < candidates[0]) return;
		else {
			for(int i = start ; i < candidates.length&&target>=candidates[i];i++) {
				if(i>start && candidates[i] == candidates[i-1]) {  //去重
					continue;
				}
				List<Integer> tmp = new ArrayList<Integer>(out);
				tmp.add(candidates[i]);
				DSF(candidates,target-candidates[i],i+1,tmp,res); //i+1
			}
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> sum = combinationSum2(new int[] {10,1,2,7,6,1,5} , 8);
		System.out.println(sum);
	}
}
