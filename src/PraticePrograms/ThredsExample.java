package PraticePrograms;

public class ThredsExample extends Thread
{
	public void run()
	{
		System.out.println("implementing the set name");
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(int i=1;i<=5;i++)
		{
			System.out.println(name + "(" + priority +")" +"i value is"+i);
		}
		
	}
	public static void main(String[] args)
	{
		 ThredsExample aobj=new ThredsExample();
		 Thread t1=new Thread(aobj);
		 Thread t2=new Thread(aobj);
		 t1.setName("frist thread");
		 t2.setName("second thread");
		 t1.start();
		 t1.setPriority(MAX_PRIORITY);
		 t2.start();
		 t2.setPriority(MIN_PRIORITY);
		 
	}
}
