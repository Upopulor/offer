package cn.wyc.leec8;

public class Demo151 {
	public static String reverseWords(String s) {
        if(s==null||s.length()==0) return null;
        if(!s.contains(" ")) return s;
        String[] split = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < split.length ; i ++) {
        	sb.append(split[split.length-i-1]);
        	if(i!=split.length-1) sb.append(" ");
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(reverseWords(" abc  efg hig"));
	}
}
