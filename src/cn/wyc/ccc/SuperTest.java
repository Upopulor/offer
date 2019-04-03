package cn.wyc.ccc;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class SuperTest {
	public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		int len = array.length;
        if(len < 2){
            return ;
        }
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(array);
        for(int i = 0 ; i < len ; i ++) {
        	if(array[i] == array[i+1]) {
        		list.add(array[i]);
        	}
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
        System.out.println(num1[0]+"-"+num2[0]);
        
	}
	public static void main(String[] args) {
		int[] k = new int[6];
		k[0] = 4;
		k[1] = 3;
		k[2] = 5;
		k[3] = 4;
		k[4] = 1;
		k[5] = 1;

	}
}