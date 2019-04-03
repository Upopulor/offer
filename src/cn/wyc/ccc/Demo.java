package cn.wyc.ccc;

public class Demo {
	/*����GC�����һ�������Ծȣ�ֻ��һ��
	 * finalize()������౻ϵͳ����һ��
	 */
	public static Demo SAVE_HOOK = null ;
	public void isAlive()
	{
		System.out.println("still alive");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method executed");
		Demo.SAVE_HOOK = this ;
	}
	public static void main (String[] args) throws Throwable {
		//1
		SAVE_HOOK = null ;
		System.gc();
		Thread.sleep(1500);
		if(SAVE_HOOK != null)
		{
			SAVE_HOOK.isAlive();
		}
		else
		{
			System.out.println("is dead");
		}
		
		//2time
		SAVE_HOOK = null ;
		System.gc();
		Thread.sleep(1500);
		if(SAVE_HOOK != null)
		{
			SAVE_HOOK.isAlive();
		}
		else
		{
			System.out.println("is dead");
		}
	}

}

