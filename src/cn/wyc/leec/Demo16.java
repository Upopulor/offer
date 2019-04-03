package cn.wyc.leec;

import java.util.Arrays;

public class Demo16 {
	public static int threeSumClosest(int[] nums, int target) {
		if(nums.length == 0) {
			return 0;
		}
        int closet = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(target - closet);
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++) {
        	int m = i+1;
        	int n = nums.length-1;
        	while(m<n) {
        		int newsum = nums[i] + nums[m] + nums[n];
        		int newqq = Math.abs(target - newsum);
        		if(newqq < diff) {
        			diff = newqq;
        			closet = newsum;
        		}
        		if(newsum < target) {
        			m++;
        		}else {
        			n--;
        		}
        	}
        }
        return closet;
    }
	public static void main(String[] args) {
		int[] kk = new int[] {-3,-2,-5,3,-4};
		int closest = threeSumClosest(kk,1);
		System.out.println(closest);
	}
	/**
	 * ���������������ӽ�����ֵ������֮�ͣ�����֮ǰ�ǵ� 3Sum ����֮�͵Ļ�������������Щ���Ѷȣ���ô
	 * ����������Ƿ��������ӽ��ڸ���ֵ��ֵ��������Ҫ��֤��ǰ�����͸�����ֵ֮��Ĳ�ľ���ֵ��С������
	 * ������Ҫ����һ������diff������¼��ľ���ֵ��Ȼ�����ǻ���Ҫ�Ƚ������Ÿ���Ȼ��ʼ�������飬˼
	 * ·���ǵ�����֮�ͺ����ƣ�������ȷ��һ������Ȼ��������ָ��left��right������Ѱ��������������ÿȷ
	 * �����������������������֮�ͣ�Ȼ����͸���ֵ�Ĳ�ľ���ֵ����newDiff�У�Ȼ���diff�Ƚϲ�����
	 * diff�ͽ��closest����
	 */
}
