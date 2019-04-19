package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.List;

public class Demo77 {
	//参考46
	//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> out = new ArrayList<Integer>();
        DFS(res , out , 1 , n , k);
        return res;
    }

	private static void DFS(List<List<Integer>> res, List<Integer> out, int level, int n, int k) {
		if(out.size() == k) {
			res.add(out);
			return ;
		}
		for(int i = level ; i <= n ; i ++) {
			List<Integer> tmp = new ArrayList<Integer>(out);
			tmp.add(i);
			DFS(res , tmp , i+1 , n , k);
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> combine = combine(4,2);
	}
}
