package cn.wyc.leec;

public class Demo6 {
	//³¬Ê±
	public static String convert(String s, int numRows) {
        if(s.length() < 2) {
        	return s;
        }
        String res = "";
        int cha = 2*numRows - 2;
        for(int i = 0 ; i < numRows ; i++) {
        	for(int j = i ; j < s.length() ; j += cha) {
        		res  += s.charAt(j);
        		int tmp = j + cha - 2*i;
        		if(i!=0 && i != numRows-1 && tmp < s.length()) {
        			res += s.charAt(tmp);
        		}
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		String ss = "LEETCODEISHIRING";
		String convert = convert(ss,3);
		System.out.println(convert);
	}
}
