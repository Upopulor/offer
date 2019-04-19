package cn.wyc.leec4;

import java.util.ArrayList;
import java.util.List;

public class Demo60 {
	//�������� [1,2,3,��,n]��������Ԫ�ع��� n! �����С�����С˳���г������������ ���ص� k ������
	/**
	 *  ȷ����һλ:
            k = 14(��0��ʼ����)
            index = k / (n-1)! = 2, ˵����15�����ĵ�һλ��3 
	            ����k
	            k = k - index*(n-1)! = 2
	        ȷ���ڶ�λ:
	            k = 2
	            index = k / (n-2)! = 1, ˵����15�����ĵڶ�λ��2
	            ����k
	            k = k - index*(n-2)! = 0
	        ȷ������λ:
	            k = 0
	            index = k / (n-3)! = 0, ˵����15�����ĵ���λ��1
	            ����k
	            k = k - index*(n-3)! = 0
	        ȷ������λ:
	            k = 0
	            index = k / (n-4)! = 0, ˵����15�����ĵ���λ��4
	        ����ȷ��n=4ʱ��15����Ϊ3214 
	 */
	public static String getPermutation(int n, int k) {
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> candidates = new ArrayList<>();
		// ��ĸ�Ľ׳���
		int[] factorials = new int[n+1];
		factorials[0] = 1;
		int fact = 1;
		for(int i = 1 ; i <= n ; i ++) {
			candidates.add(i);
			fact *= i;
			factorials[i] = fact;
		}
		k--; //��0��ʼ����
		for(int i = n-1; i >=0 ; i--) {
			int index = k/factorials[i]; //index = k / (n-1)!
			sb.append(candidates.remove(index));
			k -= index*factorials[i];  //k = k - index*(n-1)!
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(getPermutation(3,3));
	}
}
