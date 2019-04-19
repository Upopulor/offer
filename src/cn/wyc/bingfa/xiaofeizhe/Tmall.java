package cn.wyc.bingfa.xiaofeizhe;

public class Tmall {
	private int count;
	public final int MAX_COUNT = 10;
	public synchronized void push() {
		while(count >= MAX_COUNT) {
			try {
				System.out.println(Thread.currentThread().getName()+"库存达到上限");
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		count++;
		System.out.println(Thread.currentThread().getName()+"生产者生成，当前库存为："+count);
		notifyAll();
	}
	public synchronized void get() {
		while(count <= 0) {
			try {
				System.out.println(Thread.currentThread().getName()+"库存为"+count);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count--;
		System.out.println(Thread.currentThread().getName()+"消费者消费，当前库存为："+count);
		notifyAll();
	}
}
