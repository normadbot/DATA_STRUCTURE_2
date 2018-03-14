import java.lang.*;
import java.util.*;
class CustomThread extends Thread {
	CustomThread(String name){
		super(name);
		start();
	}
	@Override
	public void run(){
		try{
			for(int i=0;i<4;i++){
				System.out.println(Thread.currentThread().getName()+" thread here...");
				Thread.sleep(1000);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+" Ending...");
		}
	}
}
class MultiThreadDemo{
	public static void main(String [] args ){
		CustomThread t1 = new CustomThread("First");
		CustomThread t2 = new CustomThread("Second");
		CustomThread t3 = new CustomThread("Three");
		CustomThread t4 = new CustomThread("Four");
		try{
			for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName()+" thread here...");
					Thread.sleep(1000);
			}
		}catch(InterruptedException e){}
	}
}