package cn.wyc.leec2;

import java.util.ArrayList;
import java.util.List;

public class Demo22 {
	//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(n,n,"",list);
        return list;
    }

	private static void helper(int left, int right, String out, List<String> list) {
		if(left < 0 || right  < 0 || right < left) return;
		if(left == 0 && right == 0) {
			list.add(out);
			return;
		}
		helper(left-1,right,out+'(',list);
		helper(left,right-1,out+')',list);
	}
	public static void main(String[] args) {
		List<String> parenthesis = generateParenthesis(3);
		System.out.println(parenthesis);
	}
	/**
	 * 对于这种列出所有结果的题首先还是考虑用递归Recursion来解，由于字符串只有左括号和右括号两种字符，而且
	 * 最终结果必定是左括号3个，右括号3个，所以我们定义两个变量left和right分别表示剩余左右括号的个数，如果
	 * 在某次递归时，左括号的个数大于右括号的个数，说明此时生成的字符串中右括号的个数大于左括号的个数，即会出
	 * 现')('这样的非法串，所以这种情况直接返回，不继续处理。如果left和right都为0，则说明此时生成的字符串
	 * 已有3个左括号和3个右括号，且字符串合法，则存入结果中后返回。如果以上两种情况都不满足，若此时left大于0，
	 * 则调用递归函数，注意参数的更新，若right大于0，则调用递归函数，同样要更新参数。
	 * 
	 * 
	 * 再来看那一种方法，这种方法是CareerCup书上给的方法，感觉也是满巧妙的一种方法，这种方法的思想是找左括
	 * 号，每找到一个左括号，就在其后面加一个完整的括号，最后再在开头加一个()，就形成了所有的情况，需要注意的
	 * 是，有时候会出现重复的情况，所以我们用set数据结构，好处是如果遇到重复项，不会加入到结果中，最后我们再
	 * 把set转为vector即可
	 */
}
