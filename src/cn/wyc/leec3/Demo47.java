package cn.wyc.leec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo47 {
	//给定一个可包含重复数字的序列，返回所有不重复的全排列。
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		Arrays.sort(nums);
		int[] visited = new int[nums.length];
		DFS(nums,0,visited,out,res);
		return res;
    }
	/**
	 * 一定要能弄清楚递归函数的for循环中两个if的剪枝的意思。在此之前，首先要弄清楚level的含义，这里由于我们是用
	 * 数组out来拼排列结果，这里的level其实就是当前已经拼成的个数，其实就是out数组的长度。我们看到，for循环的起
	 * 始是从0开始的，而本题的解法二，三，四都是用了一个start变量，从而for循环都是从start开始，一定要分清楚start
	 * 和本解法中的level的区别。由于递归的for都是从0开始，难免会重复遍历到数字，而全排列不能重复使用数字，意思是每
	 * 个nums中的数字在全排列中只能使用一次（当然这并不妨碍nums中存在重复数字）。不能重复使用数字就靠visited数组
	 * 来保证，这就是第一个if剪枝的意义所在。关键来看第二个if剪枝的意义，这里说当前数字和前一个数字相同，且前一个数字
	 * 的visited值为0的时候，必须跳过。这里的前一个数visited值为0，并不代表前一个数字没有被处理过，也可能是递归结
	 * 束后恢复状态时将visited值重置为0了，实际上就是这种情况
	 */
	private static void DFS(int[] nums, int level, int[] visited, List<Integer> out, List<List<Integer>> res) {
		if(level == nums.length) {
			res.add(out);
			return;
		}
		for(int i = 0 ; i < nums.length ; i++) {
			if(visited[i] == 1) {
				continue;
			}
			if(i>0&&nums[i]==nums[i-1]&&visited[i-1]==0) {
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
		List<List<Integer>> permuteUnique = permuteUnique(new int[] {3,3,0,3});
		System.out.println(permuteUnique);
	}
}
