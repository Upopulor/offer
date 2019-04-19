package cn.wyc.leec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo47 {
	//����һ���ɰ����ظ����ֵ����У��������в��ظ���ȫ���С�
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		Arrays.sort(nums);
		int[] visited = new int[nums.length];
		DFS(nums,0,visited,out,res);
		return res;
    }
	/**
	 * һ��Ҫ��Ū����ݹ麯����forѭ��������if�ļ�֦����˼���ڴ�֮ǰ������ҪŪ���level�ĺ��壬����������������
	 * ����out��ƴ���н���������level��ʵ���ǵ�ǰ�Ѿ�ƴ�ɵĸ�������ʵ����out����ĳ��ȡ����ǿ�����forѭ������
	 * ʼ�Ǵ�0��ʼ�ģ�������Ľⷨ���������Ķ�������һ��start�������Ӷ�forѭ�����Ǵ�start��ʼ��һ��Ҫ�����start
	 * �ͱ��ⷨ�е�level���������ڵݹ��for���Ǵ�0��ʼ��������ظ����������֣���ȫ���в����ظ�ʹ�����֣���˼��ÿ
	 * ��nums�е�������ȫ������ֻ��ʹ��һ�Σ���Ȼ�Ⲣ������nums�д����ظ����֣��������ظ�ʹ�����־Ϳ�visited����
	 * ����֤������ǵ�һ��if��֦���������ڡ��ؼ������ڶ���if��֦�����壬����˵��ǰ���ֺ�ǰһ��������ͬ����ǰһ������
	 * ��visitedֵΪ0��ʱ�򣬱��������������ǰһ����visitedֵΪ0����������ǰһ������û�б��������Ҳ�����ǵݹ��
	 * ����ָ�״̬ʱ��visitedֵ����Ϊ0�ˣ�ʵ���Ͼ����������
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
