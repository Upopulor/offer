package cn.wyc.leec5;

public class Demo79 {
	//给定一个二维网格和一个单词，找出该单词是否存在于网格中。
	//单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻
	//或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用
	public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board[0].length == 0) return false;
        return true;
    }
}
