import java.lang.*;
import java.util.*;

class NewThread implements Runnable {
		String tn;
		Thread t;
		NewThread(String threadname){
			tn=threadname;
			t=new Thread(this,tn);
			System.out.println("New Thread"+t);
			t.start();
		}
		@Override
		public void run(){
			try{
				for(int j=75;j>50;j--){
					System.out.println(tn +":"+j);
					Thread.sleep(100);
				}				
			}catch(InterruptedException e){
				System.out.println(tn+"breaking up");
			}
			System.out.println(tn+"finishing..");
		}
}


 class ThreadUse2{
		public static void main(String [] args ){
		   NewThread ob1 = new NewThread("1");
		   NewThread ob2 = new NewThread("2");
			try{
				Thread.sleep(1500);
				ob1.t.suspend();
				System.out.println("thread 1 is sleeping in progress");
				Thread.sleep(1500);
				ob1.t.resume();
				System.out.println("thread 1 is now waking up");
				
				ob2.t.suspend();
				System.out.println("thread 2 is sleeping in progress");
				Thread.sleep(1500);
				ob2.t.resume();
				System.out.println("thread 2 is now waking up");
				
			}catch(InterruptedException e ){
				System.out.println("Main thread is Broken");
			}
			
			try{
				System.out.println("Waiting for Threads to finish");
				ob1.t.join();
				ob2.t.join();
			}catch(InterruptedException e){
			System.out.println("main Thread is Broken");}
			
				System.out.println("Finishing main Thread");
		}
}
