package cn.wyc.leec2;

import java.util.ArrayList;
import java.util.List;

public class Demo22 {
	//���� n �����������ŵĶ���������д��һ��������ʹ���ܹ��������п��ܵĲ�����Ч��������ϡ�
	public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(n,n,"",list);
        return list;
    }

	private static void helper(int left, int right, String out, List<String> list) {
		if(left < 0 || right  < 0 || right < left) return;
		if(left == 0 && right == 0) {
			list.add(out);
			return;
		}
		helper(left-1,right,out+'(',list);
		helper(left,right-1,out+')',list);
	}
	public static void main(String[] args) {
		List<String> parenthesis = generateParenthesis(3);
		System.out.println(parenthesis);
	}
	/**
	 * ���������г����н���������Ȼ��ǿ����õݹ�Recursion���⣬�����ַ���ֻ�������ź������������ַ�������
	 * ���ս���ض���������3����������3�����������Ƕ�����������left��right�ֱ��ʾʣ���������ŵĸ��������
	 * ��ĳ�εݹ�ʱ�������ŵĸ������������ŵĸ�����˵����ʱ���ɵ��ַ����������ŵĸ������������ŵĸ����������
	 * ��')('�����ķǷ����������������ֱ�ӷ��أ��������������left��right��Ϊ0����˵����ʱ���ɵ��ַ���
	 * ����3�������ź�3�������ţ����ַ����Ϸ�����������к󷵻ء����������������������㣬����ʱleft����0��
	 * ����õݹ麯����ע������ĸ��£���right����0������õݹ麯����ͬ��Ҫ���²�����
	 * 
	 * 
	 * ��������һ�ַ��������ַ�����CareerCup���ϸ��ķ������о�Ҳ���������һ�ַ��������ַ�����˼����������
	 * �ţ�ÿ�ҵ�һ�������ţ�����������һ�����������ţ�������ڿ�ͷ��һ��()�����γ������е��������Ҫע���
	 * �ǣ���ʱ�������ظ������������������set���ݽṹ���ô�����������ظ��������뵽����У����������
	 * ��setתΪvector����
	 */
}
