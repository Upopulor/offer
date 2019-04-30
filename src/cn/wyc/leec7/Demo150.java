package cn.wyc.leec7;

import java.util.Stack;

public class Demo150 {
	//根据逆波兰表示法，求表达式的值
	public int evalRPN(String[] tokens) {
		if(tokens.length < 1) return -1;
        if(tokens.length == 1) return Integer.valueOf(tokens[0]);
        Stack<String> stack = new Stack<String>();
        for(int i = 0 ; i < tokens.length ; i++) {
        	if(!tokens[i].equals("+")&&(!tokens[i].equals("-"))&&
        	  (!tokens[i].equals("*"))&&(!tokens[i].equals("/"))) {
        		stack.push(tokens[i]);
        	}else {
        		int t1 = Integer.valueOf(stack.pop());
        		int t2 = Integer.valueOf(stack.pop());
        		if(tokens[i].equals("+")) stack.push(String.valueOf(t1+t2));
        		if(tokens[i].equals("-")) stack.push(String.valueOf(t1-t2));
        		if(tokens[i].equals("*")) stack.push(String.valueOf(t1*t2));
        		if(tokens[i].equals("/")) stack.push(String.valueOf(t1/t2));
        	}
        }
        return Integer.valueOf(stack.pop());
    }
}
