package cn.wyc.×Ö·û´®;

public class demo {
	public String replaceSpace(StringBuffer str) {
    	String[] s = str.toString().split(" ");
    	StringBuffer aa = new StringBuffer();
    	for(int i = 0; i < s.length ; i++) {    		
    			aa.append(s[i]);
    			if(i<s.length-1) {
    				aa.append("%20");
    			}
    	}
    	return aa.toString();
    }
	public static void main(String[] args) {
		demo dd = new demo();
		String hh = dd.replaceSpace(new StringBuffer("We Are Happy"));
		System.out.println(hh);
	}
}
