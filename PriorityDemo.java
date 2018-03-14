import java.lang.*;
import java.util.*;
class Counter implements Runnable {
	Thread thread ;
	int counter=0;
	volatile boolean flag;
	public Counter(int p){
		thread = new Thread(this);
		thread.setPriority(p);
	}
	public void start(){
		flag=true;
		thread.start();
	}
	public void run(){
		while(flag)
			counter++;
	}
	public void end(){
		flag=false;
	}
}
class PriorityDemo{
	public static void main(String [] args ){
			Counter t1= new Counter(Thread.NORM_PRIORITY+2);
			Counter t2= new Counter(Thread.NORM_PRIORITY+1);
			Counter t3= new Counter(Thread.NORM_PRIORITY-1);
			Counter t4= new Counter(Thread.NORM_PRIORITY-2);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			try{
				Thread.sleep(50000);
			}catch(InterruptedException e){}
			t1.end();
			t2.end();
			t3.end();
			t4.end();
			System.out.println("Thread 1 Counted"+t1.counter);
			System.out.println("Thread 2 Counted"+t2.counter);
			System.out.println("Thread 3 Counted"+t3.counter);
			System.out.println("Thread 4 Counted"+t4.counter);
	}
}