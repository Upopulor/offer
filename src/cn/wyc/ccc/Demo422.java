package cn.wyc.ccc;

public class Demo422 {
	public static String ReverseSentence(String str) {
		int len = str.length();
		if(len < 2) {
			return str;
		}
		String of = reverse(str);
		String[] split = of.split(" ");
		String res = "";
		for(int i = 0 ; i < split.length ; i++) {
			String reverse = reverse(split[i]);
			if(i != split.length-1) {
				res+=reverse+" ";
			}else {
				res+=reverse;
			}
		}
        return res;
    }
	private static String reverse(String str) {
		if(str.length() == 1) {
			return str;
		}
		char[] charArray = str.toCharArray();
		char[] res1 = new char[charArray.length];
		for(int i = 0 ; i < charArray.length ; i++) {
			res1[i] = charArray[charArray.length-i-1];
		}
		String of = String.valueOf(res1);
		return of;
	}
	public static void main(String[] args) {
		//String ss = "student. a am I";
		String ss = " ";
		System.out.println(ss.length());
		String res = ReverseSentence(ss);
		System.out.println(res);
	}
}
