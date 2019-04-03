package cn.wyc.leec2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//相类似的题目有Path Sum II，Subsets II，Permutations，Permutations II，
//              Combinations，Combination Sum 和Combination Sum II 
public class Demo17 {
	public List<String> letterCombinations(String digits) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        char[] charArray = digits.toCharArray();
        for(int i = 0 ; i < charArray.length ; i++) {
        	String cur1 = map.get(charArray[i]);
        }
        return null;
    }
}
