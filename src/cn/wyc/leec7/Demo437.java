package cn.wyc.leec7;

import java.util.ArrayList;
import java.util.List;

public class Demo437 {
	//budui
	static int res = 0;
	public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        //int res = 0;
        List<TreeNode> out = new ArrayList<>();
        DFS(res,out,root,sum,0);
        return res;
    }
	private void DFS(int res, List<TreeNode> out, TreeNode root, int sum, int curSum) {
		if(root == null) return;
		List<TreeNode> tmp = new ArrayList<>(out);
		tmp.add(root);
		curSum+=root.val;
		int t = curSum;
		if(curSum == sum) res++;
		for(int i = 0 ; i < tmp.size()-1 ; i++) {
			t -= tmp.get(i).val;
			if(t == sum) res++;
		}
		DFS(res,tmp,root.left,sum,curSum);
		DFS(res,tmp,root.right,sum,curSum);
	}
}
