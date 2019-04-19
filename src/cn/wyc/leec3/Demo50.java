package cn.wyc.leec3;

public class Demo50 {
	//ʵ�� pow(x, n) �������� x �� n ���ݺ���
	public static double myPow(double x, int n) {
		if(n == 0) return 1.0;
		double half = myPow(x,n/2);
		if(n%2==0) return half*half;
		if(n%2>0) return half*half*x;
		return half * half / x;
    }
	public static void main(String[] args) {
		System.out.println(myPow(2.0,-2));
	}
	/**
	 * ���ǿ����õݹ����۰���㣬ÿ�ΰ�n��Сһ�룬����n���ջ���С��0���κ�����0�η���Ϊ1����ʱ��
	 * ���������سˣ������ʱn��ż����ֱ�Ӱ��ϴεݹ�õ���ֵ���ƽ�����ؼ��ɣ����������������Ҫ
	 * ���ϸ�x��ֵ������һ����Ҫ�������ǵ�ע�����n�п���Ϊ����������n�Ǹ�������������ǿ���������
	 * ����ֵ�����һ�������ȡ�䵹�����ɣ�֮ǰ�ǿ��Եģ���������test case�м��˸���2��31�η���
	 * ��Ͳ����ˣ���Ϊ�����ֵ�������������ֵ������������󣬲������ǿ�������һ��д��ֻ��һ��������
	 * ��ÿ�εݹ��д���n��������Ȼ������Ӧ�ı任����
	 */
}
