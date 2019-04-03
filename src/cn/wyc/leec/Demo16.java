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
	 * 这道题让我们求最接近给定值的三数之和，是在之前那道 3Sum 三数之和的基础上又增加了些许难度，那么
	 * 这道题让我们返回这个最接近于给定值的值，即我们要保证当前三数和跟给定值之间的差的绝对值最小，所以
	 * 我们需要定义一个变量diff用来记录差的绝对值，然后我们还是要先将数组排个序，然后开始遍历数组，思
	 * 路跟那道三数之和很相似，都是先确定一个数，然后用两个指针left和right来滑动寻找另外两个数，每确
	 * 定两个数，我们求出此三数之和，然后算和给定值的差的绝对值存在newDiff中，然后和diff比较并更新
	 * diff和结果closest即可
	 */
}
