package cn.wyc.leec;

public class Demo7 {
	public static int reverse(int x) {
        if(x == 0)  return 0;
        if(x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE) {
        	return 0;
        }
        int pop = 0 , rev = 0 ,temp = 0;
        while(x != 0) {
        	pop = x % 10;
        	x /= 10;
        	if(rev > Integer.MAX_VALUE/10 || ((rev==Integer.MAX_VALUE/10)&&pop>7)
        	|| rev < Integer.MIN_VALUE/10 || ((rev==Integer.MIN_VALUE/10)&&pop>7)) {
        		return 0;
        	}
        	temp = rev*10 + pop;
        	rev = temp;
        }
        return rev;
        
    }
	public static void main(String[] args) {
		int reverse = reverse(-1563847412);
		System.out.println(reverse);
	}
}
