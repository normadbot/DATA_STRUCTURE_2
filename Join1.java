import java.lang.*;
import java.util.*;

 class NameRunnable implements Runnable {
	public void run(){
		for(int x=1;x<10;x++){
			System.out.println("Name of Thread is :"+Thread.currentThread().getName());
			try{
			Thread.sleep(1000);
			}catch(InterruptedException ex){
			}
		}
	
	}


}
public class Join1 {
	public static void main(String [] args ) {
		NameRunnable nr = new  NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		one.setName("One");
		two.setName("two");
		one.start();
		two.start();
		try{one.join();}catch(InterruptedException ex){}	
		//one.yield();
		
		
		
	}
	
	
}