package cn.wyc.leec5;

import java.util.Arrays;

public class Demo73 {
	//给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法
	public static void setZeroes(int[][] matrix) {
        if(matrix==null) return;
        int m = matrix.length,n = matrix[0].length;
        boolean row = false , col = false;
        for(int i = 0 ; i < m ; i++) {
        	if(matrix[i][0] == 0) row = true;
        }
        for(int j = 0 ; j < n ; j++) {
        	if(matrix[0][j] == 0) col = true;
        }
        for(int i = 1 ; i < m ; i++) {
        	for(int j = 1 ; j < n ; j++) {
        		if(matrix[i][j] == 0) {
        			matrix[0][j] = 0;
        			matrix[i][0] = 0;
        		}
        	}
        }
        for(int i = 1 ; i < m ; i++) {
        	for(int j = 1 ; j < n ; j++) {
        		if(matrix[i][0] == 0||matrix[0][j] == 0) {
        			matrix[i][j] = 0;
        		}
        	}
        }
        if(row) {
        	for(int i = 0 ; i < m ; i++) {
        		matrix[i][0] = 0;
        	}
        }
        if(col) {
        	for(int j = 0 ; j < n ; j++) {
        		matrix[0][j] = 0;
        	}
        }
    }
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
		System.out.println(Arrays.toString(matrix));
	}
	/**
	 * 空间复杂度为O(mn)的解法自不用多说，直接新建一个和matrix等大小的矩阵，然后一行一行的扫，只要有0，
	 * 就将新建的矩阵的对应行全赋0，行扫完再扫列，然后把更新完的矩阵赋给matrix即可，这个算法的空间复杂
	 * 度太高。将其优化到O(m+n)的方法是，用一个长度为m的一维数组记录各行中是否有0，用一个长度为n的一维
	 * 数组记录各列中是否有0，最后直接更新matrix数组即可。这道题的要求是用O(1)的空间，那么我们就不能新
	 * 建数组，我们考虑就用原数组的第一行第一列来记录各行各列是否有0.

	- 先扫描第一行第一列，如果有0，则将各自的flag设置为true
	- 然后扫描除去第一行第一列的整个数组，如果有0，则将对应的第一行和第一列的数字赋0
	- 再次遍历除去第一行第一列的整个数组，如果对应的第一行和第一列的数字有一个为0，则将当前值赋0
	- 最后根据第一行第一列的flag来更新第一行第一列
	 */
}
