package cn.wyc.leec5;

import java.util.Arrays;

public class Demo73 {
	//����һ�� m x n �ľ������һ��Ԫ��Ϊ 0�����������к��е�����Ԫ�ض���Ϊ 0����ʹ��ԭ���㷨
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
	 * �ռ临�Ӷ�ΪO(mn)�Ľⷨ�Բ��ö�˵��ֱ���½�һ����matrix�ȴ�С�ľ���Ȼ��һ��һ�е�ɨ��ֻҪ��0��
	 * �ͽ��½��ľ���Ķ�Ӧ��ȫ��0����ɨ����ɨ�У�Ȼ��Ѹ�����ľ��󸳸�matrix���ɣ�����㷨�Ŀռ临��
	 * ��̫�ߡ������Ż���O(m+n)�ķ����ǣ���һ������Ϊm��һά�����¼�������Ƿ���0����һ������Ϊn��һά
	 * �����¼�������Ƿ���0�����ֱ�Ӹ���matrix���鼴�ɡ�������Ҫ������O(1)�Ŀռ䣬��ô���ǾͲ�����
	 * �����飬���ǿ��Ǿ���ԭ����ĵ�һ�е�һ������¼���и����Ƿ���0.

	- ��ɨ���һ�е�һ�У������0���򽫸��Ե�flag����Ϊtrue
	- Ȼ��ɨ���ȥ��һ�е�һ�е��������飬�����0���򽫶�Ӧ�ĵ�һ�к͵�һ�е����ָ�0
	- �ٴα�����ȥ��һ�е�һ�е��������飬�����Ӧ�ĵ�һ�к͵�һ�е�������һ��Ϊ0���򽫵�ǰֵ��0
	- �����ݵ�һ�е�һ�е�flag�����µ�һ�е�һ��
	 */
}
