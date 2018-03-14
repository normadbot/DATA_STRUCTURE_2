import java.lang.*;
import java.util.*;
class NewThread extends Thread{
	NewThread(){
		super("new Thread");
		System.out.println("Child Thread"+this);
		start();
	}
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("Child Thread"+i);
				Thread.sleep(200);
			}
		}catch(InterruptedException e){
			System.out.println("Child Interrupted");
		}
		System.out.println("exiting Child");
	}
}
public class ThreadExtends1{
		public static void main(String [] args){
			new NewThread();
			try{
				for(int i=0;i<5;i++){
					System.out.println("Main Thread"+i);
					Thread.sleep(1000);
				}
				
			}catch(InterruptedException e){
				System.out.println("Main Thread Interrupted");
			}
			System.out.println("Main Thread Exiting");
		}
}