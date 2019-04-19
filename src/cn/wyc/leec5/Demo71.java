package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo71 {
	//�� Unix ������һ���ļ��ľ���·��������Ҫ����
	// path = "/a/./b/../c/", => "/a/c"��path = "/a/./b/c/", => "/a/b/c"��
	//�������ǾͿ���֪���м���"."�����ֱ��ȥ������".."ʱɾ�������氤�ŵ�һ��·����������ı߽�
	//��������һЩ����п��Ե�֪������ǿյĻ�����"/"������ж��"/"ֻ����һ��
	public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] split = path.split("/");
        for(String tt : split) {
        	if(!stack.isEmpty()&&tt.equals("..")) {
        		stack.pop();
        	}else if(!tt.equals(".")&&!tt.equals("..")&&!tt.equals("")) {
        		stack.push(tt);
        	}
        }
        List<String> list = new ArrayList(stack);
        return "/"+String.join("/", list);
    }
}
