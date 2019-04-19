package cn.wyc.leec4;

public class Demo367 {
	//给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False
	/**
	 * 比如一个数字49，我们先对其除以2，得到24，发现24的平方大于49，那么再对24除以2，得到12，发现12的平方
	 * 还是大于49，再对12除以2，得到6，发现6的平方小于49，于是遍历6到12中的所有数，看有没有平方等于49的，
	 * 有就返回true，没有就返回false
	 */
	public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long x = num/2,t=x*x;
        while(t > num) {
        	x /= 2;
        	t = x*x;
        }
        for(int i = (int)x; i <= x*2 ; i++) {
        	if(i*i == num) {
        		return true;
        	}
        }
        return false;
      //二分
        /*long left = 0, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2, t = mid * mid;
            if (t == num) return true;
            else if (t < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;*/
    }
}
