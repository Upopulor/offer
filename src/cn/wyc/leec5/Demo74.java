package cn.wyc.leec5;

public class Demo74 {
	//74 -->240
	//��дһ����Ч���㷨���ж� m x n �����У��Ƿ����һ��Ŀ��ֵ���þ�������������ԣ�
	//ÿ���е����������Ұ��������С�
	//ÿ�еĵ�һ����������ǰһ�е����һ������
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0||matrix[0].length==0) return false; //ע�������ж�
        int m = matrix.length , n = matrix[0].length;
        if(target < matrix[0][0] || target > matrix[m-1][n-1]) return false;  //����������С����С��ֱ�ӷ���
        int up = 0 , down = m-1;  //ע����m-1
        int hang = 0;
        while(up <= down) {
        	int mid1 = up + (down - up)/2;
        	if(matrix[mid1][0] == target) {
        		return true;
        	}else if(matrix[mid1][0] < target ) {
        		up = mid1+1;
        	}else if(matrix[mid1][0] > target ) {
        		down = mid1-1;
        	}
        }
        int tmp = down;
        int left = 0,right = matrix[tmp].length-1;
        while(left <= right) {
        	int mid2 = left + (right - left)/2;
        	if(matrix[tmp][mid2] == target) return true;
        	else if(matrix[tmp][mid2] < target) {
        		left = mid2 + 1;
        	}else {
        		right = mid2 -1;
        	}
        }
        return false;
    }
	//���������鵱��һ��һά��������ֲ���
	public static boolean searchMatrix2(int[][] matrix, int target) {
		if(matrix.length == 0||matrix[0].length==0) return false; //ע�������ж�
        int m = matrix.length , n = matrix[0].length;
        if(target < matrix[0][0] || target > matrix[m-1][n-1]) return false;  //����������С����С��ֱ�ӷ���
        int left = 0 , right = m*n-1;  //ע����m-1
        while(left <= right) {
        	int mid = left + (right - left)/2;
        	if(matrix[mid/n][mid%n]==target) {
        		return true;
        	}else if(matrix[mid/n][mid%n]<target) {
        		left = mid -1 ;
        	}else {
        		right = mid + 1;
        	}
        }
        return false;
	}
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int[][] matrix2 = new int[][] {};
		System.out.println(searchMatrix(matrix2,0));
	}
}
