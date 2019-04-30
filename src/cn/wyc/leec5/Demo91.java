package cn.wyc.leec5;

public class Demo91 {
	/**
	 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	给定一个只包含数字的非空字符串，请计算解码方法的总数。
	 */
	public static int numDecodings(String s) {
        if(s.length() == 0||s.length()>1&&s.charAt(0) == 0) return 0;
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        for(int i = 1 ; i <= s.length() ; i ++) {
        	int t = s.charAt(i-1)-'0';
        	if(t>=1&&t<=9) {
        		dp[i] += dp[i-1];
        	}
        	if(i>=2) {
        		t = (s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
        		if(t>=10&&t<=26) {
        			dp[i] += dp[i-2];
        		}
        	}
        }
        return dp[s.length()];
    }
	public static void main(String[] args) {
		String kk = "12";
		System.out.println(numDecodings(kk));
	}
	/**
	 * 跟之前那道 Climbing Stairs 爬梯子问题 非常的相似，但是还有一些其他的限制条件，比如说一位数时不能为0，两位
	 * 数不能大于26，其十位上的数也不能为0，出去这些限制条件，根爬梯子基本没啥区别，也勉强算特殊的斐波那契数列，当然
	 * 需要用动态规划Dynamci Programming来解。建立一位dp数组，长度比输入数组长多多2，全部初始化为1，因为斐波那
	 * 契数列的前两项也为1，然后从第三个数开始更新，对应数组的第一个数。对每个数组首先判断其是否为0，若是将改为dp赋0
	 * ，若不是，赋上一个dp值，此时相当如加上了dp[i - 1], 然后看数组前一位是否存在，如果存在且满足前一位不
	 * 是0，且和当前为一起组成的两位数不大于26，则当前dp值加上dp[i - 2], 至此可以看出来跟斐波那契数组的
	 * 递推式一样
	 */
}
