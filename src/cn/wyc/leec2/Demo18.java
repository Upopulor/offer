package cn.wyc.leec2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo18 {
	//����֮��
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums == null) return res;
		int len = nums.length;
		Arrays.sort(nums);
		for(int i = 0 ; i < len-3 ; i++) {  //  1  3(len-4)  4(len-3)  7(len-2)  8(len-1) ����ȡ��3 ��<len-3
			if(i > 0 && nums[i]==nums[i-1]) continue;  //�ظ�����ǰ��
			for(int j = i+1 ; j < len - 2 ; j++) {
				if(j > i+1 && nums[j] == nums[j-1]) continue; // j > i+1 ��������i֮��ĵ�һ����ͬ��������
				int left = j + 1 , right = len - 1;  //�ӵ�3�����͵�4������ʼ���ұ���
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
