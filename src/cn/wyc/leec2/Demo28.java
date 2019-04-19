package cn.wyc.leec2;

public class Demo28 {
	public static int strStr(String haystack, String needle) {
		if(needle.length()==0){
            return 0;
       }
       if(haystack.length() < needle.length()){
           return -1;
       }
		int count = 0;
		char[] array1 = haystack.toCharArray();
		char[] array2 = needle.toCharArray();
		for(int i = 0 ; i <= array1.length-array2.length ; i ++) {
			int j = 0;
			for(j = 0 ; j < array2.length ; j++) {
				if(array1[i+j] != array2[j]) {
					break;
				}
			}
			if(j == array2.length) {
				return i;
			}
		}
        return -1;
    }
	public static void main(String[] args) {
		int strStr = strStr("aabc","aabc");
		System.out.println(strStr);
	}
}
