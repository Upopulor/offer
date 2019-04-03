package cn.wyc.ccc;

import java.util.Arrays;

public class Demo43 {
	public static boolean isContinuous(int [] numbers) {
        if(numbers == null){
            return false;
        }
        Arrays.sort(numbers);
        int zero = 0;
        int i = 0;
        for(; i < numbers.length && numbers[i] == 0 ; i++){
            zero++;
        }  //这里在上面定义i然后直接使用，到下面算断点的时候也是直接使用i，因为
        	//如果前面有0 如 0 2 3 ，， 那么算断层要从2开始，不能计算0-2，所以从i开始
        for( ; i < numbers.length - 1 && zero >= 0 ; i++){
            if(numbers[i] == numbers[i+1]){
                return false;
            }
            if(numbers[i] + 1 + zero >= numbers[i+1]){
                zero -= numbers[i+1] - 1 - numbers[i];
            }else{
                return false;
            }
        }
        if(i == numbers.length - 1){
            return true;
        }else{
            return false;
        }
    }
	public static void main(String[] args) {
		int[] ss = new int[] {0,3,2,6,4};
		boolean continuous = isContinuous(ss);
		System.out.println(continuous);
	}

}
