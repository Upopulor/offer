package cn.wyc.leec4;

public class Demo69 {
	//69 --> 367
	//实现 int sqrt(int x) 函数。
	//计算并返回 x 的平方根，其中 x 是非负整数。
	//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
	public static int mySqrt(int x) {
        if(x == 0) return 0;
        int pre = 1;
        int end = 1;
        for(int i = 1 ; i <= 46340 ; i++) { //int 最大开次方是46340
        	pre = i*i;
        	end = (i+1)*(i+1);
        	if(x>=pre&&x<end) {
        		return i;
        	}
        }
        return 46340;
    }
	//二分法
	public static int mySqrt2(int x) {
		long start=0;
        long end=(int) Math.pow(2,17)-1;
        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid>x && x>=(mid-1)*(mid-1)){
                return (int)mid-1;
            }else if(x>mid*mid){
                start=mid+1;
            }else if(x<(mid-1)*(mid-1)){
                end=mid-1;
            }else{
                return (int)mid;
            } 
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(mySqrt2(2));
	}
}
