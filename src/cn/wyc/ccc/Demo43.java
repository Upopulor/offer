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
        }  //���������涨��iȻ��ֱ��ʹ�ã���������ϵ��ʱ��Ҳ��ֱ��ʹ��i����Ϊ
        	//���ǰ����0 �� 0 2 3 ���� ��ô��ϲ�Ҫ��2��ʼ�����ܼ���0-2�����Դ�i��ʼ
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
