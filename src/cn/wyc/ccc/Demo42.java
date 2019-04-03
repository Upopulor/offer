package cn.wyc.ccc;

public class Demo42 {
	public static String LeftRotateString(String str,int n) {
		int len = str.length();
        if(len == 0 || n < 0){
            return str;
        }
        if(n == 0){
            return str;
        }
        if(n > str.length()){
            n = n%str.length();
        }
        String kk = str.substring(0, n);
        String kk2 = str.substring(n, str.length());
        return kk2+kk;
    }
	public static void main(String[] args) {
		String mm = "";
		String string = LeftRotateString(mm,6);
		System.out.println(string);
	}
}
