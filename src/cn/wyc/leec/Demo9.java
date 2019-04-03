package cn.wyc.leec;

public class Demo9 {
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
