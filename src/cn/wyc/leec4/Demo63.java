package cn.wyc.leec4;

public class Demo63 {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] path = new int[m][n];
        // ��ʼ��
        for (int i = 0; i < m; i ++) {
            // �����ϰ����߾Ͳ��ɴĬ��Ϊ0
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            path[i][0] = 1;
        }
        for (int i = 0; i < n; i ++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            path[0][i] = 1;
        }
        for (int i = 1; i < m; i ++) {
            for (int j = 1; j < n; j ++) {
                // ֱ�������ϰ���ͺ��ˣ������ϰ����λ��Ĭ��Ϊ0
                if (obstacleGrid[i][j] != 1) {
                    path[i][j] = path[i-1][j] + path[i][j-1];
                }
            }
        }
        return path[m-1][n-1];
    }
	public static void main(String[] args) {
		int[][] kk = new int[][] {{0,0,0},{0,1,1},{0,0,0}};
		int obstacles = uniquePathsWithObstacles(kk);
		System.out.println(obstacles);
	}
}
