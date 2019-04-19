package cn.wyc.bingfa.condituionXFZ;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tmall {
	private int count;
	public final int MAX_COUNT = 10;
	Lock lock = new ReentrantLock();
	Condition get = lock.newCondition();
	Condition put = lock.newCondition();
	public void put() {
		lock.lock();
		while(count >= MAX_COUNT) {
			try {
				System.out.println(Thread.currentThread().getName()+"库存达到上限");
				put.await();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		count++;
		System.out.println(Thread.currentThread().getName()+"生产者生成，当前库存为："+count);
		get.signal();
		lock.unlock();
	}
	public void get() {
		lock.lock();
		while(count <= 0) {
			try {
				System.out.println(Thread.currentThread().getName()+"库存为"+count);
				get.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count--;
		System.out.println(Thread.currentThread().getName()+"消费者消费，当前库存为："+count);
		put.signal();
		lock.unlock();
	}
}
