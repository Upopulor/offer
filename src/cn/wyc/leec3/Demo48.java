package cn.wyc.leec3;

import java.util.Arrays;

public class Demo48 {
	//将图像顺时针旋转 90 度
	public static void rotate(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        
        int[][] cur = new int[col][row];
        for(int i = 0 ;  i < row ; i++) {
        	for(int j = 0 ; j < col ; j++) {
        		cur[i][j]=matrix[i][j];
        	}
        }
        /**
         * 00 -> 02
         * 01 -> 12
         * 02 -> 22
         * 10 -> 01
         * 11 -> 11
         * 12 -> 21
         */
        if(row!=col||matrix==null) return;
        for(int i = 0 ;  i < row ; i++) {
        	for(int j = 0 ; j < col ; j++) {
        		matrix[j][row-i-1]=cur[i][j];
        	}
        }
    }
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		System.out.println(matrix);
	}
}
