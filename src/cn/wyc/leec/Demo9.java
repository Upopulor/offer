package cn.wyc.leec;

public class Demo9 {
	//�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
	//9�������� --234��������  --5���������
	public boolean isPalindrome(int x) {
        if(x < 0 || ((x%10==0)&&(x!=0))) return false;
        int res = 0;
        while(x > res) {
        	res = res*10 + x%10;
        	x = x/10;
        }
        return x == res || x == res/10;
    }
}
