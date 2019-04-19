package cn.wyc.leec3;

public class Demo36 {
	//��Ч����
	public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][10];
        boolean[][] col = new boolean[9][10];
        boolean[][] block = new boolean[9][10];
        for(int i = 0 ; i < 9 ; i++) {
        	for(int j = 0 ; j < 9 ; j++) {
        		if(board[i][j]!='.') {
        			int num = board[i][j] - '0';
        			if(row[i][num]||col[j][num]||block[i/3*3+j/3][num]) {
        				return false;
        			}
        			row[i][num] = true;
        			col[j][num] = true;
        			block[i/3*3+j/3][num] = true;
        		}
        	}
        }
        return true;
    }
}
