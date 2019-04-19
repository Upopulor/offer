package cn.wyc.bingfa.xiaofeizhe;

public class Test {
	public static void main(String[] args) {
		Tmall tmall = new Tmall();
		PushTarget pushTarget = new PushTarget(tmall);
		GetTarget getTarget = new GetTarget(tmall);
		new Thread(pushTarget).start();
		new Thread(pushTarget).start();
		new Thread(pushTarget).start();
		new Thread(pushTarget).start();
		new Thread(pushTarget).start();
		new Thread(getTarget).start();
		new Thread(getTarget).start();
		new Thread(getTarget).start();
		new Thread(getTarget).start();

	}
}
