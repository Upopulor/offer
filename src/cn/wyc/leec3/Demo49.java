package cn.wyc.leec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo49 {
	/**
	 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
		示例:
		输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
		输出:
		[
		  ["ate","eat","tea"],
		  ["nat","tan"],
		  ["bat"]
		]
	 */
	public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String,List> ans = new HashMap<String,List>();
        for(String s:strs) {
        	char[] charArray = s.toCharArray();
        	Arrays.sort(charArray);
        	String key = String.valueOf(charArray);
        	if(!ans.containsKey(key)) {
        		ans.put(key, new ArrayList());
        	}
        	ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
	public static void main(String[] args) {
		List<List<String>> list = groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
		System.out.println(list);
	}
}
