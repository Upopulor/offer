package cn.wyc.leec4;

public class Demo62 {
	//62 --> 63
	//һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����
	//������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������
	//���ܹ��ж�������ͬ��·��
	public int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for(int i = 0 ; i < m ; i ++) {
        	for(int j = 0 ; j < n ; j++) {
        		if(i == 0 || j == 0) {
        			res[i][j] = 1;
        		}else {
        			////���õ�ķ�ʽ�����ɵ���ߵ�͵��ϱߵ�ķ�ʽ��֮��
        			res[i][j] = res[i-1][j] + res[i][j-1];
        		}
        	}
        }
        return res[m-1][n-1];
    }
	//�������
	public int uniquePaths2(int m, int n) {
		int mu = 1 , zi = 1;
		int small = Math.min(m,n);
		for(int i = 0 ; i < small-1 ; i ++) {
			zi *= m+n-i-1;
			mu *= mu-i; 
		}
		return zi/mu;
	}
}
