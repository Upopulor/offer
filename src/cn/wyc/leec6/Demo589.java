package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo589 {
	//����һ�� N ������������ڵ�ֵ��ǰ�����
	//1 �ݹ�
	public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        DiGUI(root , res);
        return res;
    }
	private void DiGUI(Node root, List<Integer> res) {
		if(root == null) return ;
		res.add(root.val);
		for(Node child : root.children) {
			DiGUI(child,res);
		}
	}
	//2stack
	public List<Integer> preorder2(Node root) {
		List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
        	Node t = s.pop();
        	res.add(t.val);
        	for(int i = t.children.size()-1 ; i >= 0 ; i--) {
        		s.push(t.children.get(i));
        	}
        }
        return res;
	}
}
