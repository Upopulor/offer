package cn.wyc.leec2;

public class Demo27 {
	//26<<--
	public static int removeElement(int[] nums, int val) {
        if(nums == null) return 0;
        int i =  0;
        for(int j = 0 ; j < nums.length ; j++) {
        	if(nums[j] != val) {
        		nums[i] = nums[j];
        		i++;
        	}
        }
        return i;
    }
	public static void main(String[] args) {
		int [] ss = new int[] {3,3,2,2};
		int removeElement = removeElement(ss,3);
	}
}
