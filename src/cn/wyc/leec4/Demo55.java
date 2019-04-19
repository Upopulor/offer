package cn.wyc.leec4;

public class Demo55 {
	/**
	 * ���ﵱǰλ�õ�ʣ�ಽ����ʲô�й��أ���ʵ�Ǹ���һ��λ�õ�ʣ�ಽ������һ��λ�õ������йأ�����
	 * ����������ԭ������ÿ��λ�õ����֣���Ϊ��������Ե�ǰλ��Ϊ����ܵ������Զλ�á����Ե�ǰλ��
	 * ��ʣ�ಽ����dpֵ���͵�ǰλ�õ������еĽϴ��Ǹ��������˵�ǰ�ܵ�����Զ���룬����һ��λ�õ�ʣ��
	 * ������dpֵ���͵��ڵ�ǰ������ϴ�ֵ��ȥ1����Ϊ��Ҫ��һ������������һ��λ�ã��������Ǿ���״̬
	 * ת�Ʒ����ˣ�dp[i] = max(dp[i - 1], nums[i - 1]) - 1�������ĳһ��ʱ��dp�����ֵ
	 * Ϊ���ˣ�˵���޷��ִﵱǰλ�ã���ֱ�ӷ���false�����ѭ��������ֱ�ӷ���true����
	 */
	public boolean canJump(int[] nums) {
        int[] kk = new int[nums.length];
        kk[0] = 0;
        for(int i = 1 ; i < nums.length ; i++) {
        	kk[i] = Math.max(kk[i-1], nums[i-1])-1;
        	if(kk[i] < 0) {
        		return false;
        	}
        }
        return true;
    }
	/**
	 * ̰���㷨Greedy Algorithm����Ϊ���ǲ����Ǻܹ���ÿһ��λ���ϵ�ʣ�ಽ��������ֻϣ��֪���ܷ�
	 * ����ĩβ��Ҳ����˵����ֻ����Զ�ܵ����λ�ø���Ȥ����������ά��һ������reach����ʾ��Զ�ܵ���
	 * ��λ�ã���ʼ��Ϊ0������������ÿһ�����֣������ǰ�������reach����reach�Ѿ��ִ����һ��λ
	 * ��������ѭ��������͸���reach��ֵΪ���i + nums[i]�еĽϴ�ֵ������i + nums[i]��ʾ��
	 * ǰλ���ܵ�������λ��
	 */
	public boolean canJump2(int[] nums) {
		int reach = 0 ;
		for(int i = 0 ; i < nums.length ; i++) {
			if(i>reach||reach>nums.length) break;
			reach = Math.max(reach, reach+nums[i]);
		}
		return reach > nums.length-1;
	}
}
