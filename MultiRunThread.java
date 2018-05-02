import java.lang.*;
import java.util.*;
import java.io.*;
class MultiThread extends Thread{
	public void run(){
		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println("Thread 2 is  here"+i);
			}
		   }
	    }
}
class MultiThread2 extends Thread{
	public void run(){
		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println("Thread 5 is  here"+i);
			}
		 } 
	    }
}
public class MultiRunThread{
	public static void main(String[] args)throws Exception {
		for(int i=0;i<10;i++){
		MultiThread2 n= new MultiThread2();
		MultiThread m= new MultiThread();
			m.start();
			
			n.start();
		//	System.out.println("here is Thread 1");
		}	
	}
}