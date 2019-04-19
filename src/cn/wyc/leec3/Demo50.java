package cn.wyc.leec3;

public class Demo50 {
	//实现 pow(x, n) ，即计算 x 的 n 次幂函数
	public static double myPow(double x, int n) {
		if(n == 0) return 1.0;
		double half = myPow(x,n/2);
		if(n%2==0) return half*half;
		if(n%2>0) return half*half*x;
		return half * half / x;
    }
	public static void main(String[] args) {
		System.out.println(myPow(2.0,-2));
	}
	/**
	 * 我们可以用递归来折半计算，每次把n缩小一半，这样n最终会缩小到0，任何数的0次方都为1，这时候
	 * 我们再往回乘，如果此时n是偶数，直接把上次递归得到的值算个平方返回即可，如果是奇数，则还需要
	 * 乘上个x的值。还有一点需要引起我们的注意的是n有可能为负数，对于n是负数的情况，我们可以先用其
	 * 绝对值计算出一个结果再取其倒数即可，之前是可以的，但是现在test case中加了个负2的31次方后，
	 * 这就不行了，因为其绝对值超过了整型最大值，会有溢出错误，不过我们可以用另一种写法只用一个函数，
	 * 在每次递归中处理n的正负，然后做相应的变换即可
	 */
}
