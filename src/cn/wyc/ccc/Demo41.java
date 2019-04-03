package cn.wyc.ccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo41 {
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int len = array.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(len < 3){
            return res;
        }
        int small = 0;
        int big = len-1;
        while(big >= small){
            int cur = array[small] + array[big] ; 
            if(cur == sum){
                res.add(array[small]);
                res.add(array[big]);
                small++;
                continue;
            }else if(cur > sum){
                big--;
            }else{
                small++;
            }
        }
        if(res.isEmpty()) {
        	return res;
        }
        int[] gg = null;
        HashMap<Integer, ArrayList<Integer>> kk = new HashMap<Integer, ArrayList<Integer>>();
        for(int i = 0 ; i < res.size()/2 ; i++) {
        	int jj = res.get(i*2)*res.get(i*2+1);
        	ArrayList<Integer> ss = new ArrayList<Integer>();
        	ss.add(res.get(i*2));
        	ss.add(res.get(i*2+1));
        	kk.put(jj, ss);
        }
        List<Map.Entry<Integer, ArrayList<Integer>>> list = new ArrayList<Map.Entry<Integer, ArrayList<Integer>>>(kk.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer, ArrayList<Integer>>>() {
            //…˝–Ú≈≈–Ú
			@Override
			public int compare(Entry<Integer, ArrayList<Integer>> o1, Entry<Integer, ArrayList<Integer>> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
            
        });
        return list.get(0).getValue();
    }
	public static void main(String[] args) {
		int[] dd = new int[6];
		dd[0] = 1;
		dd[1] = 2;
		dd[2] = 4;
		dd[3] = 7;
		dd[4] = 11;
		dd[5] = 16;
		ArrayList<Integer> sum = FindNumbersWithSum(dd,10);
		System.out.println(sum);
	}

}
