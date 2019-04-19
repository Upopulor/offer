package cn.wyc.leec5;

import java.util.Arrays;

public class Demo75 {
	//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
	//此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色
	public static void sortColors(int[] nums) {
        if(nums.length == 0) return ;
        int r=0,w=0,b=0;
        for(int i = 0 ; i < nums.length ; i ++) {
        	if(nums[i] == 0) r++;
        	else if(nums[i] == 1) w++;
        	else b++;
        }
        for(int i = 0 ; i < r ; i++) {
        	nums[i] = 0;
        }
        for(int i = r ; i < r+w;i++) {
        	nums[i] = 1;
        }
        for(int i = r+w ; i < nums.length ; i ++) {
        	nums[i] = 2;
        }
    }
	//只遍历一次数组来求解，那么我需要用双指针来做，分别从原数组的首尾往中心移动。
	//- 定义red指针指向开头位置，blue指针指向末尾位置
	//- 从头开始遍历原数组，如果遇到0，则交换该值和red指针指向的值，并将red指针后移
	//一位。若遇到2，则交换该值和blue指针指向的值，并将blue指针前移一位。若遇到1，则继续遍历
	public static void sortColors2(int[] nums) {
		if(nums.length == 0) return ;
		int r=0,b=nums.length-1;
		for(int i = 0 ; i <= b ; i ++) {
			if(nums[i] == 0) {
				int tmp1 = nums[i];nums[i] = nums[r]; nums[r] = tmp1; r++;
			}else if(nums[i] == 2) {
				//和后面的换，后面换回来的新数要重新比较 i--
				int tmp2 = nums[i];nums[i] = nums[b] ; nums[b] = tmp2;b--;i--;
			}
		}
	}
	public static void main(String[] args) {
		int[] kk = new int[] {2,0,2,1,1,0};
		sortColors2(kk);
		System.out.println(Arrays.toString(kk));
		
	}
}
