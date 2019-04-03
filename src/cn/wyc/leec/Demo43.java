package cn.wyc.leec;

public class Demo43 {
	public static String multiply(String num1, String num2) {
        if(num1 == null || num2 == null) {
        	return "";
        }
        int alen = num1.length()-1;
        int blen = num2.length()-1;
        int res[] = new int[alen+blen+2];
        for(int i = alen ; i >= 0 ; i--) {
        	for(int j = blen ; j >= 0 ; j--) {
        		int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
        		mul += res[i+j+1];
        		res[i+j] += mul/10;
        		res[i+j+1] = mul%10;
        	}
        }
        StringBuilder sd = new StringBuilder();
        int i = 0;
        // 去掉前导0
        while(i < res.length-1 && res[i] == 0) 
            i++;
        for(; i < res.length; ++i)
            sd.append(res[i]);
        return sd.toString();
    }
	public static void main(String[] args) {
		String a = "123";
		String b = "456";
		String multiply = multiply(a,b);
		System.out.println(multiply);
	}
	/**
	 * 如果自己在写些例子出来，不难发现，两数相乘得到的乘积的长度其实正好是两个数字的长度之和，若 num1 
	 * 长度为m，num2 长度为n，则 num1 x num2 的长度为 m+n，还有就是要明白乘的时候为什么要错位，比
	 * 如6乘8得到的48为啥要跟6乘9得到的54错位相加，因为8是十位上的数字，其本身相当于80，所以错开的
	 * 一位实际上末尾需要补的0。还有一点需要观察出来的就是，num1 和 num2 中任意位置的两个数字相乘，得
	 * 到的两位数在最终结果中的位置是确定的，比如 num1 中位置为i的数字乘以 num2 中位置为j的数字，那么
	 * 得到的两位数字的位置为 i+j 和 i+j+1，明白了这些后，我们就可以进行错位相加了，累加出最终的结果。

由于我们要从个位上开始相乘，所以从 num1 和 num2 字符串的尾部开始往前遍历，分别提取出对应位置上的字符，
将其转为整型后相乘。然后确定相乘后的两位数所在的位置 p1 和 p2，由于 p2 相较于 p1 是地位，所以我们将得到
的两位数 mul 先加到 p2 位置上去，这样可能会导致 p2 位上的数字大于9，所以我们将十位上的数字要加到高位 p1
 上去，只将余数留在 p2位置，这样每个位上的数字都变成一位。然后要做的是从高位开始，将数字存入结果res中，记
 住 leading zeros 要跳过，最后处理下 corner case，即若结果 res 为空，则返回 "0"，否则返回结果 res
	 */
}
