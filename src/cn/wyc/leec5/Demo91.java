package cn.wyc.leec5;

public class Demo91 {
	/**
	 * һ��������ĸ A-Z ����Ϣͨ�����·�ʽ�����˱��룺
	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	����һ��ֻ�������ֵķǿ��ַ������������뷽����������
	 */
	public static int numDecodings(String s) {
        if(s.length() == 0 ) return 0;
        if(s.length() == 1&&Integer.valueOf(s)>0) return 1;
        if(s.length() == 2 && Integer.valueOf(s)<=26&&Integer.valueOf(s)>0) return 2;
        return numDecodings(s.substring(0, s.length()-1)) 
        		+ numDecodings(s.substring(0, s.length()-2));
    }
	public static void main(String[] args) {
		String kk = "0";
		System.out.println(numDecodings(kk));
	}
}
