package cn.wyc.leec5;

public class Demo240 {
	//��дһ����Ч���㷨������ m x n ���� matrix �е�һ��Ŀ��ֵ target���þ�������������ԣ�
	//ÿ�е�Ԫ�ش������������С�
	//ÿ�е�Ԫ�ش��ϵ����������С�
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
