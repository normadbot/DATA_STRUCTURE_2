import java.lang.*;
import java.util.*;
import java.io.*;
public class YieldImplement1 implements Runnable{
	public  void run(){
		for(int i=0;i<10;i++){
			System.out.println("Here a"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args)throws Exception {
		YieldImplement1 a = new YieldImplement1();
		Thread t1= new Thread(a);
		t1.start();
		//t1.wait();	
		t1.join();
		for (int i=0;i<10;i++) {
		//	Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}

	}
}