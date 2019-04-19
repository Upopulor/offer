package cn.wyc.leec5;

public class Demo240 {
	//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
	//每行的元素从左到右升序排列。
	//每列的元素从上到下升序排列。
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0|| matrix[0].length == 0) return false;
        int m = matrix.length , n = matrix[0].length;
        if(target < matrix[0][0] || target > matrix[m-1][n-1]) return false;
        int x = m-1 , y = 0;
        while(true) {
        	if(matrix[x][y] > target) {
        		x--;
        	}else if(matrix[x][y] < target) {
        		y++;
        	}else {
        		return true;
        	}
        	if(x < 0 || y > n-1) {
        		break;
        	}
        }
        return false;
    }
}
