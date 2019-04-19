package cn.wyc.leec5;

public class Demo80 {
	//���� Remember
	//����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ�����������Σ������Ƴ���������³��ȡ�
	//��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ�����������
	public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <= 2) return len;
        int pre = 0 , cur = 1 , count = 1;
        while(cur < len) {
        	if(nums[pre] == nums[cur] && count == 0) cur++;
        	else {
        		if(nums[pre] == nums[cur]) --count;
        		else count = 1;
        		nums[++pre] = nums[cur++];
        	}
        }
        return pre+1;
    }
	/**
	 * ������������ظ��Ĵ��������Σ���ô���Ǿ���Ҫ��һ������count����¼�������м����ظ���
	 * count��ʼ��Ϊ1��������ֹ�һ���ظ�����count�ݼ�1����ô�´��ٳ����ظ�����ָ��ֱ��
	 * ǰ��һ���������ʱ�����ظ��ģ���count�ָ�1��������������������ģ�����һ�����ֲ�
	 * �ظ���������һ����������󣬴���֮�󲻻������ظ���
	 */
}
