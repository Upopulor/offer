package cn.wyc;

public class Demo49 {
	public static int StrToInt(String str) {
		if(str == null || str.length() == 0) {
			return 0;
		}
    	String of = null;
    	int kk = 0;
    	char[] charArray = str.toCharArray();
    	if(charArray[0] != 43 && charArray[0] != 45 && (charArray[0]<48||charArray[0]>57)) {
    		return 0;
    	}
    	for(int j = 1 ; j < charArray.length ; j ++) {
    		if((charArray[j]<48||charArray[j]>57)) {
    			return 0;
    		}
    	}
    	if(charArray[0] == 43 ) {
    		of = String.valueOf(charArray);
    		of = of.substring(1, of.length());
    		for(int i = of.length() ; i >= 1 ; i--) {
            	kk+=(of.charAt(i-1)-48)*Math.pow(10, (of.length()-i));
            }
    		return kk;
    	}else if(charArray[0] == 45) {
    		of = String.valueOf(charArray);
    		for(int i = of.length() ; i >= 2 ; i--) {
            	kk+=(of.charAt(i-1)-48)*Math.pow(10, (of.length()-i));
            }
    		if(kk == 2147483647){
    			return 0-kk;
    		}else if(kk == 2147483647+1){
    			return 0-kk-1;
    		}else {
    			return 0-kk;
    		}
    		
    	}
    	else {
    		of = String.valueOf(charArray);
    		for(int i = of.length() ; i >= 1 ; i--) {
            	kk+=(of.charAt(i-1)-48)*Math.pow(10, (of.length()-i));
            }
    		return kk;
    	}
        
    }
	public static void main(String[] args) {
		String s = "-2147483648";
		int strToInt = StrToInt(s);
		System.out.println(strToInt);
	}
}
