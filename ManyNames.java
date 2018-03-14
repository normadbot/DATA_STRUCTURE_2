import java.util.*;
import java.lang.*;


 class NameRunnable implements Runnable{
	public void run(){
		for (int x=1;x<4;x++){
			System.out.println("Run by:"+Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){}
		}
	
	
	}

}
public class ManyNames {
	public static void main(String [] args ) {
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		one.setName("Fred");
		one.start();	
		
	}
	
	
}