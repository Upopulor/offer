package cn.wyc.ccc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo4 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 123;
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Demo4 ss = new Demo4();
		FutureTask<Integer> ff = new FutureTask<Integer>(ss);
		Thread thread = new Thread(ff);
		thread.start();
		System.out.println(ff.get());
		double ss1 = 1.2;
		double ss2 = 2.2;
		Math.max(ss1, ss2);
	}

}
