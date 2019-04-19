package cn.wyc.leec4;

import java.util.ArrayList;
import java.util.List;

public class Demo60 {
	//给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。按大小顺序列出所有排列情况 返回第 k 个排列
	/**
	 *  确定第一位:
            k = 14(从0开始计数)
            index = k / (n-1)! = 2, 说明第15个数的第一位是3 
	            更新k
	            k = k - index*(n-1)! = 2
	        确定第二位:
	            k = 2
	            index = k / (n-2)! = 1, 说明第15个数的第二位是2
	            更新k
	            k = k - index*(n-2)! = 0
	        确定第三位:
	            k = 0
	            index = k / (n-3)! = 0, 说明第15个数的第三位是1
	            更新k
	            k = k - index*(n-3)! = 0
	        确定第四位:
	            k = 0
	            index = k / (n-4)! = 0, 说明第15个数的第四位是4
	        最终确定n=4时第15个数为3214 
	 */
	public static String getPermutation(int n, int k) {
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> candidates = new ArrayList<>();
		// 分母的阶乘数
		int[] factorials = new int[n+1];
		factorials[0] = 1;
		int fact = 1;
		for(int i = 1 ; i <= n ; i ++) {
			candidates.add(i);
			fact *= i;
			factorials[i] = fact;
		}
		k--; //从0开始计数
		for(int i = n-1; i >=0 ; i--) {
			int index = k/factorials[i]; //index = k / (n-1)!
			sb.append(candidates.remove(index));
			k -= index*factorials[i];  //k = k - index*(n-1)!
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(getPermutation(3,3));
	}
}
