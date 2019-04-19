package cn.wyc.leec4;

public class Demo62 {
	//62 --> 63
	//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
	//机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
	//问总共有多少条不同的路径
	public int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for(int i = 0 ; i < m ; i ++) {
        	for(int j = 0 ; j < n ; j++) {
        		if(i == 0 || j == 0) {
        			res[i][j] = 1;
        		}else {
        			////到该点的方式数是由到左边点和到上边点的方式数之和
        			res[i][j] = res[i-1][j] + res[i][j-1];
        		}
        	}
        }
        return res[m-1][n-1];
    }
	//排列组合
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
