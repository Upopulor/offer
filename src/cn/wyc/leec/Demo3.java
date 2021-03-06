package cn.wyc.leec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {
	//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
	public static int lengthOfLongestSubstring(String s) {
		if(s.length() <= 0) {
			return 0;
		}
		int[] m = new int[256];
        Arrays.fill(m, -1);
        int res = 0, left = -1;
        for (int i = 0; i < s.length(); ++i) {
            left = Math.max(left, m[s.charAt(i)]);
            m[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }
        return res;
    } 
	public static void main(String[] args) {
		String ss = "dvdf";
		int res = lengthOfLongestSubstring(ss);
		System.out.println(res);
	}
}
