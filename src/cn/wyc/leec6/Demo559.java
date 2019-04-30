package cn.wyc.leec6;

public class Demo559 {
	//给定一个 N 叉树，找到其最大深度。
	public int maxDepth(Node root) {
        if(root == null) return 0;
        int res = 1;
        for(Node child : root.children) {
        	res = Math.max(res, maxDepth(child)+1);
        }
        return res;
    }
}
