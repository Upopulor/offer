package cn.wyc.leec2;

public class Demo12 {
	public static String intToRoman(int num) {
		//整数转罗马字
        String res = "";
        int[] nums = new int[] {1000,500,100,50,10,5,1};
        char[] fuus = new char[] {'M','D','C','L','X','V','I'};
        for(int i = 0 ; i < 7 ; i+=2) { //1000 100 10 1共四个
        	int x = num/nums[i];
        	if(x < 4) {
        		for(int j = 0 ; j < x ; j++) {  //III
        			res = res + fuus[i];
        		}
        	}else if(x == 4) {
        		res = res + fuus[i] +fuus[i-1];  //IV
        	}else if(x>4 && x<9) {
        		res += fuus[i-1];
        		for(int k = 6 ; k <= x; k++) {   //viii 8
        			res = res +fuus[i];
        		}
        	}else if(x == 9) {
        		res = res + fuus[i] + fuus[i-2];  //ix 9 
        	}
        	num %= nums[i];
        }
        return res;
    }
	public static void main(String[] args) {
		String intToRoman = intToRoman(1994);
		System.out.println(intToRoman);
	}
}
