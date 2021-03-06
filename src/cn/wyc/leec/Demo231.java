package cn.wyc.leec;

public class Demo231 {
	//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
	public static boolean isPowerOfTwo(int n) {
        int count = 0;
        if(n == Integer.MIN_VALUE) {
        	return false;
        }
        for(int i = 0 ; i < 32 ; i++){
            if((n&1)==1) {
            	count++;
            }
            n = n>>1;
            if(count > 1) {
            	return false;
            }
        }
        return count == 1?true:false;
    }
	public static void main(String[] args) {
		boolean powerOfTwo = isPowerOfTwo(1);
		System.out.println(powerOfTwo);
	}
}
