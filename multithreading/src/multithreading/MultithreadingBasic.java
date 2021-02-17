package multithreading;

class Add implements Runnable
{

	public void run() 
	{	
		int sum = 0;
		for(int i=0; i<5; i++)
		{
			System.out.println(sum+=(i+1));
		}
	}
	 
}
class Multiply implements Runnable
{
	public void run() 
	{
		int mul = 1;
		for(int i=0; i<5; i++)
		{
			System.out.println(mul*=(i+1));
		}	
	}
	
}
public class MultithreadingBasic {
	public static void main(String args[]) throws InterruptedException
	{
		Add obj1 = new Add();
		Multiply obj2 = new Multiply();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("bye from thread t1 and t2");
		
		System.out.println("bye from main thread");
	}
}
