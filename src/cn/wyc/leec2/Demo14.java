package cn.wyc.leec2;

public class Demo14 {
	public static String longestCommonPrefix(String[] strs) {
		//最长公共前缀
		String res = "";
        if(strs == null  || strs.length == 0) return res;
        for(int i = 0 ; i < strs[0].length() ; i++) {
        	//这里随意去一个就行
        	char cc = strs[0].charAt(i);
        	for(int j = 1 ; j < strs.length ; j++) {
        		if(i>=strs[j].length()||strs[j].charAt(i)!=cc) {  //先判断长短，否则读到空会报错
        			return res;
        		}
        	}
        	res += Character.toString(cc);
        }
        return res;
    }
	public static void main(String[] args) {
		String[] strs = new String[] {"abcf","abcfff","abc","abcaa"};
		String commonPrefix = longestCommonPrefix(strs);
		System.out.println(commonPrefix);
	}
}
