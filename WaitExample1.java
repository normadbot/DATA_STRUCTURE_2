import java.lang.*;
import java.util.*;
import java.io.*;
public class WaitExample1{
	public static void main(String[] args)throws Exception {
		Thread a = new Producer();
		Thread b= new Consumer();
		a.start();
		b.start();	
		
	}
}
class Producer extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("I am Producer : Produced Item "+i);
		//	Thread.yield();

		}
	}
}
class Consumer extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("I am Consumer : Consumed Item "+i);
		//	Thread.yield();
		}
		
	}
}