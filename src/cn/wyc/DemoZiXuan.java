package cn.wyc;

import java.util.Random;

public class DemoZiXuan {
public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " �߳�ִ��...");
				
				try {
					Thread.sleep(new Random().nextInt(2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " �߳�ִ�������...");
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " �߳�ִ��...");
				
				try {
					Thread.sleep(new Random().nextInt(2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " �߳�ִ�������...");
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " �߳�ִ��...");
				
				try {
					Thread.sleep(new Random().nextInt(2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " �߳�ִ�������...");
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " �߳�ִ��...");
				
				try {
					Thread.sleep(new Random().nextInt(2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " �߳�ִ�������...");
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " �߳�ִ��...");
				
				try {
					Thread.sleep(new Random().nextInt(2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " �߳�ִ�������...");
			}
		}).start();
		
		while(Thread.activeCount() != 1) {
			// ����
		}


		System.out.println("���е��߳�ִ�������...");
	}

}