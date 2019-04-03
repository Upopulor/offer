package cn.wyc.leec;

import java.util.Arrays;

public class Demo4 {
	//not done
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null && nums2 == null) {
        	return 0;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        double a = nums1.length/2==1?nums1[nums1.length/2]:(nums1[nums1.length/2]+nums1[nums1.length/2-1])/2.0;
        double b = nums2.length/2==1?nums2[nums2.length/2]:(nums2[nums2.length/2]+nums2[nums2.length/2-1])/2.0;
        return (a+b)/2.0;
    }
	public static void main(String[] args) {
		int[] t1 = new int[] {1,3};
		int[] t2 = new int[] {3,4};
		double d = findMedianSortedArrays(t1,t2);
		System.out.println(d);
		System.out.println(6/2);
	}
}
