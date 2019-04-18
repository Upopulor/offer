package cn.wyc.leec;

public class Demo5 {
	public static String longestPalindrome(String s) {
		//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
		//超时
        if(s.length() < 2) {
        	return s;
        }
        for(int i = s.length() ; i > 0 ; i--) {
        	for(int j = 0 ; j <= s.length()-i ; j++) {
        		String cur = s.substring(j, i+j);
        		int count = 0;
        		for(int k = 0 ; k < cur.length()/2 ; k++) {
        			if(cur.charAt(k) == cur.charAt(cur.length()-k-1)) {
        				count++;
        			}
        		}
        		if(count == cur.length()/2) {
        			return cur;
        		}
        	}
        }
        return "";
    }
	//2 答案对，测试不过
	private static int maxLen = 0;
	private static String sub = "";
	public static String longestPalindrome2(String s) {
		if(s.length() < 2) {
        	return s;
        }
		for(int i = 0 ; i < s.length()-1 ; i++) {
			find(s,i,i);
			find(s,i,i+1);
		}
		return sub;
	}

	private static void find(String s, int start, int end) {
		while(start >= 0 && end <= s.length()-1) {
			if(s.charAt(start)==s.charAt(end)) {
				if(end - start + 1 > maxLen) {
					maxLen = end - start + 1 ;
					sub = s.substring(start, end+1);
				}
				end++;
				start--;
			}else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		String kk = "cbbd";
		String ff = longestPalindrome2(kk);
		System.out.println(ff);
	}
}
