package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.List;

public class Demo95 {
	//给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
	public static List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return generate(1,n);
    }
	private static List<TreeNode> generate(int start, int end) {
		List<TreeNode> res = new ArrayList<TreeNode>();
		if(start > end) {
			res.add(null);
		}else {
			for(int i = start ; i <= end ; i++) {
				List<TreeNode> left = generate(start,i-1);
				List<TreeNode> right = generate(i+1,end);
				for(int j = 0 ; j < left.size();j++) {
					for(int k = 0 ; k < right.size() ; k++) {
						TreeNode treeNode = new TreeNode(i);
						treeNode.left = left.get(j);
						treeNode.right = right.get(k);
						res.add(treeNode);
					}
				}
			}
		}
		return res;
	}
}
