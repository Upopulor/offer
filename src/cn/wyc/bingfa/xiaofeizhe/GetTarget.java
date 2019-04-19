package cn.wyc.bingfa.xiaofeizhe;

public class GetTarget implements Runnable{
	private Tmall tmall;
	public GetTarget(Tmall tmall) {
		this.tmall = tmall;
	}
	@Override
	public void run() {
		while(true) {
			tmall.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
