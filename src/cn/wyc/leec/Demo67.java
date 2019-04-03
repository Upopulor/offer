package cn.wyc.leec;

public class Demo67 {
	public static String addBinary(String a, String b) {
        if(a == null || b == null) {
        	return null;
        }
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        int aalen = aa.length-1;
        int bblen = bb.length-1;
        String ff = "";
        int carry = 0;
        while(aalen >= 0 || bblen >=0) {
        	int m = (aalen>=0?aa[aalen--]-'0':0);
        	int n = (bblen>=0?bb[bblen--]-'0':0);
        	int sum = m + n + carry;
        	ff = sum%2+ff;
        	carry = sum/2;
        }
        return carry == 1?"1"+ff:ff;
    }
	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		
		String binary = addBinary(a,b);
		System.out.println(binary);
	}
	/**
	 * ��������ָ��ֱ�ָ��a��b��ĩβ��Ȼ��ÿ��ȡ��һ���ַ���תΪ���֣����޷�ȡ���ַ���0����Ȼ����
	 * ��λcarry����ʼ��Ϊ0�������߼���������2ȡ�༴Ϊ��ǰλ�����֣���2ȡ�̼�Ϊ��ǰ��λ��ֵ���ǵ����
	 * Ҫ�ж���carry�����Ϊ1�Ļ���Ҫ�ڽ����ǰ�����һ��1
	 */
}
