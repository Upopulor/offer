package cn.wyc.leec2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Demo20 {
	public static boolean isValid(String s) {
		if(s == null || s.length()==0) return true;
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('(', 1);
		map.put(')', 1);
		map.put('[', 2);
		map.put(']', 2);
		map.put('{', 3);
		map.put('}', 3);
		for(int i = 0 ; i < charArray.length ; i++) {
			char c = charArray[i];
			if(!stack.isEmpty()) {
				if(map.get(stack.peek()) == map.get(c)&&stack.peek()!=c) {
					stack.pop();
				}else{
					stack.push(c);
				}
			}else {
				stack.push(c);
			}
		}
        return stack.isEmpty()?true:false;
    }
	public static void main(String[] args) {
		boolean valid = isValid("{{");
		System.out.println(valid);
	}
}
