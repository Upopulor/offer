package cn.wyc.leec;

public class Demo43 {
	public static String multiply(String num1, String num2) {
        if(num1 == null || num2 == null) {
        	return "";
        }
        int alen = num1.length()-1;
        int blen = num2.length()-1;
        int res[] = new int[alen+blen+2];
        for(int i = alen ; i >= 0 ; i--) {
        	for(int j = blen ; j >= 0 ; j--) {
        		int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
        		mul += res[i+j+1];
        		res[i+j] += mul/10;
        		res[i+j+1] = mul%10;
        	}
        }
        StringBuilder sd = new StringBuilder();
        int i = 0;
        // ȥ��ǰ��0
        while(i < res.length-1 && res[i] == 0) 
            i++;
        for(; i < res.length; ++i)
            sd.append(res[i]);
        return sd.toString();
    }
	public static void main(String[] args) {
		String a = "123";
		String b = "456";
		String multiply = multiply(a,b);
		System.out.println(multiply);
	}
	/**
	 * ����Լ���дЩ���ӳ��������ѷ��֣�������˵õ��ĳ˻��ĳ�����ʵ�������������ֵĳ���֮�ͣ��� num1 
	 * ����Ϊm��num2 ����Ϊn���� num1 x num2 �ĳ���Ϊ m+n�����о���Ҫ���׳˵�ʱ��ΪʲôҪ��λ����
	 * ��6��8�õ���48ΪɶҪ��6��9�õ���54��λ��ӣ���Ϊ8��ʮλ�ϵ����֣��䱾���൱��80�����Դ���
	 * һλʵ����ĩβ��Ҫ����0������һ����Ҫ�۲�����ľ��ǣ�num1 �� num2 ������λ�õ�����������ˣ���
	 * ������λ�������ս���е�λ����ȷ���ģ����� num1 ��λ��Ϊi�����ֳ��� num2 ��λ��Ϊj�����֣���ô
	 * �õ�����λ���ֵ�λ��Ϊ i+j �� i+j+1����������Щ�����ǾͿ��Խ��д�λ����ˣ��ۼӳ����յĽ����

��������Ҫ�Ӹ�λ�Ͽ�ʼ��ˣ����Դ� num1 �� num2 �ַ�����β����ʼ��ǰ�������ֱ���ȡ����Ӧλ���ϵ��ַ���
����תΪ���ͺ���ˡ�Ȼ��ȷ����˺����λ�����ڵ�λ�� p1 �� p2������ p2 ����� p1 �ǵ�λ���������ǽ��õ�
����λ�� mul �ȼӵ� p2 λ����ȥ���������ܻᵼ�� p2 λ�ϵ����ִ���9���������ǽ�ʮλ�ϵ�����Ҫ�ӵ���λ p1
 ��ȥ��ֻ���������� p2λ�ã�����ÿ��λ�ϵ����ֶ����һλ��Ȼ��Ҫ�����ǴӸ�λ��ʼ�������ִ�����res�У���
 ס leading zeros Ҫ������������� corner case��������� res Ϊ�գ��򷵻� "0"�����򷵻ؽ�� res
	 */
}
