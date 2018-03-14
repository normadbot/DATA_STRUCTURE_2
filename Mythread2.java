import java.lang.*;
import java.util.*;
import java.io.*;
class MyThread1 implements Runnable{
	@Override
	public  void run() {
		System.out.println("Hey this is My thread");
		System.out.println("Thread name is "+Thread.currentThread().getName());
	}
}
public class Mythread2 {
	public static void main(String [] args ) {
		MyThread1 a = new MyThread1();
		Thread t = new Thread(a);
		t.setName("FirstThread");
		t.start();
	}

}