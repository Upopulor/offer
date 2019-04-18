package cn.wyc.leec;

public class Demo342 {
	//4µÄÃÝ
	public static boolean isPowerOfFour(int num) {
        if(num == 4) return true;
        int count = 0;
        int jo = 0;
        for(int i = 0 ;  i<32 ; i ++) {
        	if((num&1) == 1) {
        		count ++;
        		jo = ((i%2)==0)?2:1;
        	}
        	num = num>>1;
        	if(count > 1) {
        		return false;
        	}
        }
        return (count==1)&&(jo==2)?true:false; 
    }
	public static void main(String[] args) {
		boolean four = isPowerOfFour(16);
		System.out.println(four);
	}
}
