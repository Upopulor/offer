package cn.wyc.leec4;

public class Demo367 {
	//����һ�������� num����дһ����������� num ��һ����ȫƽ�������򷵻� True�����򷵻� False
	/**
	 * ����һ������49�������ȶ������2���õ�24������24��ƽ������49����ô�ٶ�24����2���õ�12������12��ƽ��
	 * ���Ǵ���49���ٶ�12����2���õ�6������6��ƽ��С��49�����Ǳ���6��12�е�������������û��ƽ������49�ģ�
	 * �оͷ���true��û�оͷ���false
	 */
	public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long x = num/2,t=x*x;
        while(t > num) {
        	x /= 2;
        	t = x*x;
        }
        for(int i = (int)x; i <= x*2 ; i++) {
        	if(i*i == num) {
        		return true;
        	}
        }
        return false;
      //����
        /*long left = 0, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2, t = mid * mid;
            if (t == num) return true;
            else if (t < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;*/
    }
}
