package cn.wyc.leec8;

public class Demo152 {
	public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0) return -1;
        int[] fn = new int[nums.length];
        int[] gn = new int[nums.length];
        fn[0] = nums[0];
        gn[0] = nums[0];
        int res = nums[0];
        for(int i = 1 ; i < nums.length ; i ++) {
        	fn[i]  = Math.max(Math.max(fn[i-1]*nums[i], gn[i-1]*nums[i]),nums[i]);
        	gn[i]  = Math.min(Math.min(fn[i-1]*nums[i], gn[i-1]*nums[i]),nums[i]);
        	res = Math.max(res, fn[i]);
        }
        return res;
    }
}
