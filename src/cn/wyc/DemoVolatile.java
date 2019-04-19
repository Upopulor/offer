package cn.wyc;

public class DemoVolatile {
	public volatile int a = 1;

	public  int getA() {
		return a++;
	}

	public  void setA(int a) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.a = a;
	}

	public static void main(String[] args) {
		DemoVolatile demo = new DemoVolatile();
		new Thread(new Runnable() {
			@Override
			public void run() {
				//demo.setA(10);
				demo.a = 10;
			}
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(demo.getA());
			}
		}).start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("最终的结果为：" + demo.getA());

	}

}
