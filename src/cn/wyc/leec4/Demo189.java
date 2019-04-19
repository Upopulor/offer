package cn.wyc.leec4;

import java.util.Arrays;

public class Demo189 {
	//����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ���
	public static void rotate(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return ;
        int len = nums.length;
        int[] res = new int[len];
        for(int i = 0 ; i <len ; i++) {
        	res[(i+k)%len] = nums[i];
        }
        for(int i = 0 ; i < len ; i ++) {
        	nums[i] = res[i];
        }
    }
	/**
     * ˫��ѭ��
     * ʱ�临�Ӷȣ�O(kn)
     * �ռ临�Ӷȣ�O(1)
     */
    public void rotate_1(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    /**
     * ��ת
     * ʱ�临�Ӷȣ�O(n)
     * �ռ临�Ӷȣ�O(1)
     */
    public void rotate_2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }


    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    /**
     * ѭ������
     * ʱ�临�Ӷȣ�O(n)
     * �ռ临�Ӷȣ�O(1)
     */
    public void rotate_3(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        // ��һ�ν�����Ϻ�ǰ k λ����λ����ȷ���� n-k λ��������� k λ����˳����󣬼�������
        for (int start = 0; start < nums.length && k != 0; n -= k, start += k, k %= n) {
            for (int i = 0; i < k; i++) {
                swap(nums, start + i, nums.length - k + i);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	public static void main(String[] args) {
		int[] kk = new int[] {1,2,3,4,5,6,7};
		rotate(kk,3);
		System.out.println(Arrays.toString(kk));
	}
}
