package cn.wyc.leec5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo71 {
	//以 Unix 风格给出一个文件的绝对路径，你需要简化它
	// path = "/a/./b/../c/", => "/a/c"和path = "/a/./b/c/", => "/a/b/c"，
	//这样我们就可以知道中间是"."的情况直接去掉，是".."时删掉它上面挨着的一个路径，而下面的边界
	//条件给的一些情况中可以得知，如果是空的话返回"/"，如果有多个"/"只保留一个
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
