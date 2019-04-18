package cn.wyc.leec;

public class Demo8 {
	//请你来实现一个 atoi 函数，使其能将字符串转换成整数。
	//首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
	public static int myAtoi2(String str) {//budui
        if(str.length()<=0) {
        	return 0;
        }
        String ss ="";
        int fu = 0;
        int kk = 0,start = 0,end = 0;
        int len = str.length();
        for(int i = 0 ; i < len ; i++) {
        	if((47>str.charAt(i)||str.charAt(i)>58)&&(kk==1)) {
        		break;
        	}
        	if(47<str.charAt(i)&&str.charAt(i)<58&&(kk==0)) {
        		start = i;
        		kk = 1;
        	}else if((str.charAt(i)==45)&&((47<str.charAt(i+1)&&str.charAt(i+1)<58))&&(kk==0)) {
        		start = i;
        		kk = 1;
        		fu = 1;
        	}
        	if(47<str.charAt(i)&&str.charAt(i)<58&&(kk==1)) {
        		end = i;
        	}
        	
        } 
        if(str.substring(start, end+1).length()>11&&fu==1) {
        	return fu==1?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }else if(str.substring(start, end+1).length()>10&&fu==0) {
        	return fu==1?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        int ll = Integer.valueOf(str.substring(start, end+1));
        if(ll > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ll < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return Integer.valueOf(str.substring(start, end+1));
    }
	public static int myAtoi(String str) {
		if(str.isEmpty()) return 0;
		int sign = 1,base = 0,i = 0,len = str.length();
		while(i < len && str.charAt(i) == ' ') {
			++i;
		}
		if(i < len && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
			sign = (str.charAt(i++) == '+')?1:-1;
		}
		while(i < len && str.charAt(i)>='0' && str.charAt(i)<='9') {
			if(base>Integer.MAX_VALUE/10 || (base == Integer.MAX_VALUE/10 && str.charAt(i)-'0'>7)) {
				return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			base = 10 * base + (str.charAt(i++)-'0');
		}
		return base*sign;
	}
	public static void main(String[] args) {
		String str = "  -42";
		int myAtoi = myAtoi(str);
		System.out.println(myAtoi);
	}
}
