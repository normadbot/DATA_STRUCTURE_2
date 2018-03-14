import java.lang.*;
import java.util.*;

class Myrunnable implements Runnable {
	synchronized void display(){
			System.out.println("First Thread Running");
		}
		public void run(){
			try{
				for(int i=0;i<=3;i++){
					display();
				}
				Thread.sleep(1);
			}catch(InterruptedException e){
				
			}
		}
}
public class ThreadSync1{
	public static void main(String [] args ){
			Myrunnable mr = new Myrunnable();
			Thread t = new Thread(mr);
			t.start();
			try{
			for(int i=0;i<=3;i++){
				Thread.sleep(100);
				System.out.println("Second Thread Running");
				
			}
			}catch(InterruptedException w){
				
			}
	}
}