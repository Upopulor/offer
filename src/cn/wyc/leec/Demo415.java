package cn.wyc.leec;

public class Demo415 {
	public static String addStrings(String num1, String num2) {
        if(num1 == null || num2 == null) {
        	return null;
        }
        String res = "";
        int alen = num1.length();
        int blen = num2.length();
        int m = alen - 1;
        int n = blen - 1;
        int carry = 0;
        while(m >= 0 || n >= 0) {
        	int a = m >= 0 ? num1.charAt(m--)-'0':0;
        	int b = n >= 0 ? num2.charAt(n--)-'0':0;
        	int sum = a + b + carry;
        	res = sum%10 + res;
        	carry = sum/10;
        }
        return carry == 1 ? "1"+res : res;
    }
	public static void main(String[] args) {
		String a = "12345";
		String b = "54321";
		String addStrings = addStrings(a,b);
		System.out.println(addStrings);
	}
}
