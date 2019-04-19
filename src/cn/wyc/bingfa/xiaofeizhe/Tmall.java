package cn.wyc.bingfa.xiaofeizhe;

public class Tmall {
	private int count;
	public final int MAX_COUNT = 10;
	public synchronized void push() {
		while(count >= MAX_COUNT) {
			try {
				System.out.println(Thread.currentThread().getName()+"���ﵽ����");
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		count++;
		System.out.println(Thread.currentThread().getName()+"���������ɣ���ǰ���Ϊ��"+count);
		notifyAll();
	}
	public synchronized void get() {
		while(count <= 0) {
			try {
				System.out.println(Thread.currentThread().getName()+"���Ϊ"+count);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count--;
		System.out.println(Thread.currentThread().getName()+"���������ѣ���ǰ���Ϊ��"+count);
		notifyAll();
	}
}
