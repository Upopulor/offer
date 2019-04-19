package cn.wyc.bingfa.xiaofeizhe;

public class PushTarget implements Runnable{
	private Tmall tmall;
	public PushTarget(Tmall tmall) {
		this.tmall = tmall;
	}
	@Override
	public void run() {
		while(true) {
			tmall.push();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
