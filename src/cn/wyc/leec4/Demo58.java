package cn.wyc.leec4;

public class Demo58 {
	//����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
	public static int lengthOfLastWord(String s) {
		//return s.trim().length()-s.trim().lastIndexOf(" ")-1;
		if(s==null||s.length()==0) return 0;
		int right = s.length(), res = 0;
		while(right > 0 && s.charAt(right-1)==' ') --right;
		while(right > 0 && s.charAt(right-1)!=' ') {
			--right;
			res++;
		}
		return res;
    }
	public static void main(String[] args) {
		String ss = "hello World";
		int length = ss.length();
		char charAt = ss.charAt(length-1);
		int kk = lengthOfLastWord("hello World");
		System.out.println(kk);
	}
}
