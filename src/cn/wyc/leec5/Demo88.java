package cn.wyc.leec5;

import java.util.Arrays;

public class Demo88 {
	//�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ����������
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0) return ;
        for(int i = m ; i < m+n ; i ++) {
        	nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
	public static void merge2(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1,j = n-1,k=m+n-1;
		while(i>=0&&j>=0) {
			if(nums1[i]>nums2[j]) nums1[k--] = nums1[i--];
			else nums1[k--] = nums2[j--];
		}
		while(j>=0) {
			nums1[k--] = nums2[j--];
		}
	}
	public static void main(String[] args) {
		int[] k1 = new int[] {1,2,3,0,0,0};
		int[] k2 = new int[] {2,5,6};
		merge(k1,3,k2,3);
		System.out.println(Arrays.toString(k1));
	}
}
