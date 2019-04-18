package cn.wyc.leec;

public class Demo9 {
	//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
	//9回文数字 --234回文链表  --5最长回文数字
	public boolean isPalindrome(int x) {
        if(x < 0 || ((x%10==0)&&(x!=0))) return false;
        int res = 0;
        while(x > res) {
        	res = res*10 + x%10;
        	x = x/10;
        }
        return x == res || x == res/10;
    }
}
