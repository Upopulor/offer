package cn.wyc.leec4;

public class Demo64 {
	//给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小
	public int minPathSum(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1 ; i < m ; i++) {
        	dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for(int j = 1 ; j < n ; j ++) {
        	dp[0][j] = grid[0][j] + dp[0][j-1];
        }
        for(int i = 1 ; i < m ; i++) {
        	for(int j = 1 ; j < n ; j++) {
        		dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
        	}
        }
        return dp[m-1][n-1];
    }
}
