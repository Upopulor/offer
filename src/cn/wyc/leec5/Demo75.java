package cn.wyc.leec5;

import java.util.Arrays;

public class Demo75 {
	//����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�
	//�����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ
	public static void sortColors(int[] nums) {
        if(nums.length == 0) return ;
        int r=0,w=0,b=0;
        for(int i = 0 ; i < nums.length ; i ++) {
        	if(nums[i] == 0) r++;
        	else if(nums[i] == 1) w++;
        	else b++;
        }
        for(int i = 0 ; i < r ; i++) {
        	nums[i] = 0;
        }
        for(int i = r ; i < r+w;i++) {
        	nums[i] = 1;
        }
        for(int i = r+w ; i < nums.length ; i ++) {
        	nums[i] = 2;
        }
    }
	//ֻ����һ����������⣬��ô����Ҫ��˫ָ���������ֱ��ԭ�������β�������ƶ���
	//- ����redָ��ָ��ͷλ�ã�blueָ��ָ��ĩβλ��
	//- ��ͷ��ʼ����ԭ���飬�������0���򽻻���ֵ��redָ��ָ���ֵ������redָ�����
	//һλ��������2���򽻻���ֵ��blueָ��ָ���ֵ������blueָ��ǰ��һλ��������1�����������
	public static void sortColors2(int[] nums) {
		if(nums.length == 0) return ;
		int r=0,b=nums.length-1;
		for(int i = 0 ; i <= b ; i ++) {
			if(nums[i] == 0) {
				int tmp1 = nums[i];nums[i] = nums[r]; nums[r] = tmp1; r++;
			}else if(nums[i] == 2) {
				//�ͺ���Ļ������滻����������Ҫ���±Ƚ� i--
				int tmp2 = nums[i];nums[i] = nums[b] ; nums[b] = tmp2;b--;i--;
			}
		}
	}
	public static void main(String[] args) {
		int[] kk = new int[] {2,0,2,1,1,0};
		sortColors2(kk);
		System.out.println(Arrays.toString(kk));
		
	}
}
