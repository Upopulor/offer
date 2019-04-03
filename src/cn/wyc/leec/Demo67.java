package cn.wyc.leec;

public class Demo67 {
	public static String addBinary(String a, String b) {
        if(a == null || b == null) {
        	return null;
        }
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        int aalen = aa.length-1;
        int bblen = bb.length-1;
        String ff = "";
        int carry = 0;
        while(aalen >= 0 || bblen >=0) {
        	int m = (aalen>=0?aa[aalen--]-'0':0);
        	int n = (bblen>=0?bb[bblen--]-'0':0);
        	int sum = m + n + carry;
        	ff = sum%2+ff;
        	carry = sum/2;
        }
        return carry == 1?"1"+ff:ff;
    }
	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		
		String binary = addBinary(a,b);
		System.out.println(binary);
	}
	/**
	 * 用了两个指针分别指向a和b的末尾，然后每次取出一个字符，转为数字，若无法取出字符则按0处理，然后定义
	 * 进位carry，初始化为0，将三者加起来，对2取余即为当前位的数字，对2取商即为当前进位的值，记得最后还
	 * 要判断下carry，如果为1的话，要在结果最前面加上一个1
	 */
}
