package cn.wyc.bingfa.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
	private int signal;
	Lock lock = new ReentrantLock();
	Condition a = lock.newCondition();
	Condition b = lock.newCondition();
	Condition c = lock.newCondition();
	public void a() {
		lock.lock();
		while(signal!=0) {
			try {
				a.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("a");
		b.signal();
		lock.unlock();
	}
	public void b() {
		lock.lock();
		while(signal!=0) {
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("b");
		c.signal();
		lock.unlock();
	}
	public void c() {
		lock.lock();
		while(signal!=0) {
			try {
				c.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("c");
		a.signal();
		lock.unlock();
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		A a = new A(d);
		B b = new B(d);
		C c = new C(d);
		
		new Thread(a).start();
		new Thread(b).start();
		new Thread(c).start();

	}
}
class A implements Runnable {
	
	private Demo demo;
	
	public A(Demo demo) {
		this.demo = demo;
	}

	@Override
	public void run() {
		while(true) {
			demo.a();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class B implements Runnable {
	
	private Demo demo;
	
	public B(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		while(true) {
			demo.b();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class C implements Runnable {
	
	private Demo demo;
	
	public C(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		while(true) {
			demo.c();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

