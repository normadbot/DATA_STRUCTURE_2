import java.lang.*;
import java.util.*;
import java.io.*;
class Helper implements Runnable{
		public void run(){
			try{

				System.out.println("Thread2 is going to sleep for 500");
				Thread.sleep(500);
			}catch(InterruptedException e){
					System.out.println(e);
			}
		}
}
public class TestThread1 implements Runnable{
	public void run(){
		System.out.println("Thread1 is going now");
	}
	public static void main(String[] args) {
		TestThread1 ob1 = new TestThread1();
		Helper ob2= new Helper();
		Thread t1 = new Thread(ob1," ->t1 thread");
		Thread t2= new Thread(ob2," ->t2 Thread");

		t1.start();
		t2.start();

		ClassLoader load= t1.getContextClassLoader();
		Thread t3= new Thread(new Helper());
		System.out.println(Thread.activeCount());
		t1.checkAccess();

		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		System.out.println("Thread name "+t1.getName());
		System.out.println("Thread ID "+t1.getId());

		System.out.println("Priority of Thread "+t1.getPriority());

		System.out.println(t1.getState());

		t2= new Thread(ob2);
		t2.start();
		t2.interrupt();
		System.out.println("IS Thread2 Interrupted "+t2.interrupted());
		System.out.println("IS Thread2 Alive "+t2.isAlive());
		


	}
}