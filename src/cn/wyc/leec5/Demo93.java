package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo93 {
	//给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式
	//超时，应该对
	public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        if(s.length() == 0) return res;
        DFS(res , s , 0 , "");
        return res;
    }
	private static void DFS(List<String> res, String s, int n, String out) {
		if(n == 4) {
			if(s.isEmpty()) {
				res.add(out);
				return;
			}	
		}
		for(int k = 1 ; k < 4 ; k++) {
			if(s.length() < k) break;
			int val = Integer.valueOf(s.substring(0, k));
			if(val > 255 || k != String.valueOf(val).length()) {
				continue;
			}
			DFS(res , s.substring(k) , n+1 , out + s.substring(0, k) + (n == 3 ? "" : "."));
		}
	}
	public static void main(String[] args) {
		List<String> restoreIpAddresses = restoreIpAddresses("25525511135");
		System.out.println(restoreIpAddresses);
	}
}
