package cn.wyc.ccc;

import java.util.ArrayList;

public class Demo5 {
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> >  res = new ArrayList<ArrayList<Integer> >();
       if(sum < 3 ){
           return res;
       }
       int small = 1;
        int big = 2;
        int mid = (1+sum)/2;
        int cur = small+big;
        while(small < mid){
        	while(cur < sum ){
            	big ++ ;
                cur += big;
            }
            if(cur == sum){
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int i = small ; i <= big ; i++){
                    list.add(i);
                }
                res.add(list);
            }
            cur -= small;
            small++;
        }
        return res;
    }
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > ff= FindContinuousSequence(15);
		System.out.println(ff);
	}
}
