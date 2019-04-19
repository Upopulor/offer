package cn.wyc.leec4;

public class Demo53 {
	public static int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums==null) return 0;
        int sum = nums[0];
        int curSum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
        	if(curSum < 0) {
        		curSum = nums[i];
        	}else {
        		curSum += nums[i];
        	}
        	if(sum < curSum) {
        		sum = curSum;
        	}
        	
        }
        return sum;
    }
	public static void main(String[] args) {
		int maxSubArray = maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		System.out.println(maxSubArray);
	}
}
