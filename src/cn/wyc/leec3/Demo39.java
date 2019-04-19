package cn.wyc.leec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo39 {
	//����һ�����ظ�Ԫ�ص����� candidates ��һ��Ŀ���� target ���ҳ� candidates �����п���ʹ���ֺ�Ϊ target �����
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		Arrays.sort(candidates); //���������жϴ�С����ǰ�˳�
		combinationSumDFS(candidates,target,0,out,res);
		return res;
    }
	private static void combinationSumDFS(int[] candidates,int target,int start,
										List<Integer> tmp,List<List<Integer>> res) {
		if(target == 0) {
			res.add(tmp);
			return;
		}
		if(target < candidates[0]) {  //���������ˣ���С��������С�����˳�������Ϊ0
			return;
		}
		//��start��ʼ���ж�����Ϊtarget>=candidates[i]����������ظ�
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
