package cn.wyc.leec;

public class Demo191 {
	public int hammingWeight(int n) {
		//编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数
        int count = 0;
        for(int i = 0 ; i < 32 ; i++){
            if((n&1) == 1) {
            	count++;
            }
            n = n>>1;
        }
        return count;
    }
}
