package cn.wyc.leec4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo56 {
	public static List<Interval> merge(List<Interval> intervals) {
		if(intervals.isEmpty()) {
			return intervals;
		}
		intervals.sort(new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				 if (o1.start > o2.start) {
                     return 1;
                 } else if (o1.start < o2.start) {
                     return -1;
                 }

                 return 0;
			}
		});
		Interval pre = intervals.get(0);
		Interval cur = null;
		for (int i = 1; i < intervals.size();) {
			cur = intervals.get(i);
			// 不能合并
			if (cur.start > pre.end) {
				pre = cur;
				//重要
                i++;
			} else {
				pre.end = Math.max(pre.end, cur.end);
				intervals.remove(i);
			}
		}
		return intervals;
    }
	public static void main(String[] args) {
		Interval a1 = new Interval(4,6);
		Interval a2 = new Interval(2,3);
		Interval a3 = new Interval(1,3);
		List<Interval> ff = new ArrayList<Interval>();
		ff.add(a1);
		ff.add(a3);
		ff.add(a2);
		merge(ff);
	}
}
