import java.lang.*;
import java.util.*;
import java.io.*;
public class SynchronizedExample2{
	public static void main(String[] args) {
		Thread1 a= new Thread1();
		

		Thread b= new Thread(a);
		Thread c= new Thread(a);
		b.start();
		c.start();
	}
}
class Thread1 implements Runnable{	
	public  void run(){
		synchronized(this){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	  }
	}
}