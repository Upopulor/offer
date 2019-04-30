package cn.wyc.leec6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo590 {
	//����һ�� N ������������ڵ�ֵ�ĺ������
	//1 Digui
	public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        DiGUI(root , res);
        return res;
    }
	private void DiGUI(Node root, List<Integer> res) {
		if(root == null) return ;
		for(Node child : root.children) {
			DiGUI(child, res);
		}
		res.add(root.val);
	}
	//2 stack
	public List<Integer> postorder2(Node root) {
		List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
        	Node t = s.pop();
        	res.add(0, t.val);
        	//for(int i = 0 ; i <= t.children.size()-1 ; i ++) {  ʹ����ȥ���������forѭ���ᳬʱ
            for(Node child : t.children){
        		//s.push(root.children.get(i));
                s.push(child);
        	}
        }
        return res;
	}
}
