package cn.wyc.leec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Demo15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> kk = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if(nums.length == 0 || nums[0] > 0 || nums[nums.length-1] < 0) {
        	return kk;
        }
        for(int i  = 0 ; i < nums.length ; i++) {
        	if(nums[i] > 0) {
        		break;
        	}
        	if(i>0&&nums[i] == nums[i-1]) {
        		continue;
        	}
        	int ddf = 0 - nums[i];
        	int m = i+1,n = nums.length-1;
        	while(m<n) {
        		if(ddf == nums[m] + nums[n]) {
        			List<Integer> list = new ArrayList<Integer>();
        			list.add(nums[i]);
        			list.add(nums[m]);
        			list.add(nums[n]);
        			kk.add(list);
        			while(m<n&&nums[m] == nums[m+1]) {
        				m++;
        			}
        			while(m>n&&nums[n] == nums[n-1]) {
        				n--;
        			}
        			m++;
        			n--;
        		}else if(ddf < nums[m] + nums[n]) {
        			n--;
        		}else {
        			m++;
        		}
        		
        	}
        }
        return kk;
    }
	public static void main(String[] args) {
		int [] ww = new int[] {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> sum = threeSum(ww);
	}
	/**
	 * �����������������֮�ͣ���֮ǰ�ǵ�Two SumҪ����һЩ���������ǹ���fixһ������Ȼ������������ʹ��Two Sum��
	 * ��HashMap�Ľⷨ�����ǻ����ظ�������֣�����ʹ��set��ȥ���ظ�Ҳ���У���TLE���������Ⲣ���ǿ�����Two Sum��
	 * �ⷨ����ô����������һ���������ص㣬Ҫ�����ҳ��������Һ�Ϊ0����ô����������ȫ��0�����֮�⣬�϶����и�����������
	 * ���ǻ���Ҫ��fixһ������Ȼ��ȥ������������������ֻҪ�ҵ��������Һ�Ϊ��һ��fix�����෴�������ˣ���Ȼ����������
	 * ����ʹ��Two Sum�����ֽⷨ���ң�����ܸ���Ч�Ķ�λ�أ����ǿ϶���ϣ��������������������ϰɣ����������������
	 * ��ģ���ô���ǾͿ�����˫ָ��������ʱ�临�Ӷ����������������������������ϡ����Ƕ�ԭ�����������Ȼ��ʼ����
	 * ���������飬����ע�ⲻ�Ǳ��������һ��ֹͣ�����ǵ������������Ϳ����ˡ��������ǿ�����������֦�Ż������ǵ�����
	 * ��������ʱ���break��Ϊɶ�أ���Ϊ���ǵ�����������������ˣ������һ��Ҫfix�������������ˣ���ô��������־Ͷ�
	 * ������������Զ������ֺ�Ϊ0������ˡ�Ȼ�����ǻ�Ҫ�����ظ��������Ĵ����������Ǵӵڶ�������ʼ�������ǰ�����
	 * ����ȣ�����������Ϊ���ǲ������ͬ������fix���Ρ����ڱ�������������0��ȥ���fix�����õ�һ��target��Ȼ��ֻ��
	 * Ҫ��֮���ҵ�������֮�͵���target���ɡ�����������ָ��ֱ�ָ��fix����֮��ʼ��������β�����������������������
	 * Ϊtarget��������������fix����һ��������С�Ȼ����������ظ����ֵĲ����ˣ�����ָ�붼��Ҫ����ظ����֡����
	 * ����֮��С��target�������ǽ�����Ǹ�ָ��i����һλ��ʹ��ָ�����������һЩ��ͬ���������֮�ʹ���target����
	 * ���ǽ��ұ��Ǹ�ָ��j����һλ��ʹ��ָ������ּ�СһЩ
	 */
}
