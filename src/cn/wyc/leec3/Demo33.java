package cn.wyc.leec3;

public class Demo33 {
	/**
	 * 0����1����2���� 4����5����6����7
		7����0����1���� 2����4����5����6
		6����7����0���� 1����2����4����5
		5����6����7���� 0����1����2����4
		4����5����6����7����0����1����2
		2����4����5����6����7����0����1
		1����2����4����5����6����7����0
		�����������Ĺؼ����ڻ�����м������ж�����Ҫ�������λ����Ұ�Σ����ǹ۲�
		�����ɫ�����ֶ�������ģ��ɴ����ǿ��Թ۲�����ɣ�����м����С�����ұߵ���
		�����Ұ��������ģ����м����������ұ�����������������ģ�����ֻҪ�������
		���������β�����������ж�Ŀ��ֵ�Ƿ�����һ�����ڣ������Ϳ���ȷ�������İ����
	 */
	public int search(int[] nums, int target) {
		if(nums.length == 0) return 0;
		int left = 0 , right = nums.length-1;
		while(left <= right) {
			int mid = left + (right-left)/2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < nums[right]) {  //���������
				if(nums[mid] < target && nums[right] >= target) left=mid+1;  //��������
				else right = mid-1;											 //��������
			}else {  //���������
				if(nums[left] <= target && nums[mid] > target) right=mid-1;   //��������
				else left = mid+1;                                           //��������
			} 
		}
        return -1;
    }
}
