package cn.wyc.leec2;

import java.util.HashMap;
import java.util.Map;

public class Demo13 {
	//��������תint
	/**
	 * ��һ�������ǰ���������һ�����֣�����֮������ֱ���С�Ļ�������ϵ�ǰ���֡�
	�ڶ�������������ȥ������֡�
	 */
	public static int romanToInt(String s) {
		int res = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(int i = 0 ; i < s.length() ; i++) {
			int val = map.get(s.charAt(i));
			if(i == s.length()-1 || map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
				res += val;
			}else {
				res -= val;
			}
		}
		return res;
    }
	public static void main(String[] args) {
		int romanToInt = romanToInt("III");
		System.out.println(romanToInt);
	}
}
