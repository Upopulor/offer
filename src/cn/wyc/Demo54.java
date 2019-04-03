package cn.wyc;

import java.util.ArrayList;
import java.util.List;

public class Demo54 {
	public static int LastRemaining_Solution(int n, int m) {
        if(n <= 0){
            return -1;
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i ++){
            list.add(i);
        }
        int cur = 0;
        int dd = 0;
        while(list.size()!=1){
            dd = ((m-1)%list.size()+cur)%list.size();
            list.remove(dd);
            cur = dd;
        }
        return list.get(0);
    }
	public static void main(String[] args) {
		int solution = LastRemaining_Solution(5,3);
		System.out.println(solution);
	}
}
