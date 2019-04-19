package cn.wyc.leec3;

public class Demo38 {
	//报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
	//	1.     1
	//	2.     11
	//	3.     21
	//	4.     1211
	//	5.     111221
	//fasle
	public static String countAndSay2(int n) {
        if(n==1) {
        	return "1";
        }
        if(n==2) {
        	return "11";
        }
        if(n == 3) {
        	return "21";
        }
        if(n > 3) {
        	return countAndSay(n-1).substring(countAndSay(n-1).length()/2, countAndSay(n-1).length())
        		 + countAndSay(n-1).substring(0,countAndSay(n-1).length()/2)
        		 + countAndSay(n-2);
        }
        return "";
    }
	//true
	public static String countAndSay(int n) {
        if(n <= 0 ) return "";
        String res = "1";
        while((--n)>0) {
        	String cur = "";
        	for(int i = 0 ; i < res.length() ; i ++) {
        		int cnt = 1;
        		while(i+1<res.length()&&res.charAt(i+1) == res.charAt(i)) {
        			cnt++;
        			i++;
        		}
        		cur +=  String.valueOf(cnt)+res.charAt(i);
        	}
        	res = cur;
        }
        return res;
    }
	public static void main(String[] args) {
		String countAndSay = countAndSay(4);
		System.out.println(countAndSay);
	}
}
