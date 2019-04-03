package cn.wyc;

import java.util.Arrays;

public class Demo55 {
	public static int[] multiply(int[] A) {
        int len = A.length;
        int [] B = new int[len];
        B[0] = 1;
        for(int i = 1 ; i < len ; i++){
            B[i] = B[i-1]*A[i-1];  //b[2] = b[1] * a[1] = a[0] * a[1];
        }
        int tmp = 1;
        for(int j = len-2 ; j >= 0 ; j--){
             tmp *=  A[j+1];//µÚÈý²½ temp *= a[2] = a[4] * a[3] * a[2]; 
             B[j]*= tmp;  //b[1] = b[1] * temp = a[0] * a[4] * a[3] * a[2]; 
        }
        return B;
    }
	public static void main(String[] args) {
		int[] dd = new int[] {1,2,3,4,5};
		int[] multiply = multiply(dd);
		System.out.println(Arrays.toString(multiply));
	}
}
