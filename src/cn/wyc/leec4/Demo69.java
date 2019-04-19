package cn.wyc.leec4;

public class Demo69 {
	//69 --> 367
	//ʵ�� int sqrt(int x) ������
	//���㲢���� x ��ƽ���������� x �ǷǸ�������
	//���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
	public static int mySqrt(int x) {
        if(x == 0) return 0;
        int pre = 1;
        int end = 1;
        for(int i = 1 ; i <= 46340 ; i++) { //int ��󿪴η���46340
        	pre = i*i;
        	end = (i+1)*(i+1);
        	if(x>=pre&&x<end) {
        		return i;
        	}
        }
        return 46340;
    }
	//���ַ�
	public static int mySqrt2(int x) {
		long start=0;
        long end=(int) Math.pow(2,17)-1;
        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid>x && x>=(mid-1)*(mid-1)){
                return (int)mid-1;
            }else if(x>mid*mid){
                start=mid+1;
            }else if(x<(mid-1)*(mid-1)){
                end=mid-1;
            }else{
                return (int)mid;
            } 
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(mySqrt2(2));
	}
}
