package cn.wyc.leec2;

public class Demo26 {
	//19<--  -->27
	public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++) {
        	if(nums[i] != nums[j]) {
        		i++;
        		nums[i] = nums[j];
        	}
        }
        return i+1;
    }
}
