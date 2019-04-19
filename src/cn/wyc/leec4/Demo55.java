package cn.wyc.leec4;

public class Demo55 {
	/**
	 * 到达当前位置的剩余步数跟什么有关呢，其实是跟上一个位置的剩余步数和上一个位置的跳力有关，这里
	 * 的跳力就是原数组中每个位置的数字，因为其代表了以当前位置为起点能到达的最远位置。所以当前位置
	 * 的剩余步数（dp值）和当前位置的跳力中的较大那个数决定了当前能到的最远距离，而下一个位置的剩余
	 * 步数（dp值）就等于当前的这个较大值减去1，因为需要花一个跳力到达下一个位置，所以我们就有状态
	 * 转移方程了：dp[i] = max(dp[i - 1], nums[i - 1]) - 1，如果当某一个时刻dp数组的值
	 * 为负了，说明无法抵达当前位置，则直接返回false，最后循环结束后直接返回true即可
	 */
	public boolean canJump(int[] nums) {
        int[] kk = new int[nums.length];
        kk[0] = 0;
        for(int i = 1 ; i < nums.length ; i++) {
        	kk[i] = Math.max(kk[i-1], nums[i-1])-1;
        	if(kk[i] < 0) {
        		return false;
        	}
        }
        return true;
    }
	/**
	 * 贪婪算法Greedy Algorithm，因为我们并不是很关心每一个位置上的剩余步数，我们只希望知道能否
	 * 到达末尾，也就是说我们只对最远能到达的位置感兴趣，所以我们维护一个变量reach，表示最远能到达
	 * 的位置，初始化为0。遍历数组中每一个数字，如果当前坐标大于reach或者reach已经抵达最后一个位
	 * 置则跳出循环，否则就更新reach的值为其和i + nums[i]中的较大值，其中i + nums[i]表示当
	 * 前位置能到达的最大位置
	 */
	public boolean canJump2(int[] nums) {
		int reach = 0 ;
		for(int i = 0 ; i < nums.length ; i++) {
			if(i>reach||reach>nums.length) break;
			reach = Math.max(reach, reach+nums[i]);
		}
		return reach > nums.length-1;
	}
}
