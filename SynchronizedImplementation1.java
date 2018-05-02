import java.lang.*;
import java.util.*;
import java.io.*;
class Th implements Runnable{
	public void run(){
		synchronized(this){
		 for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+ " "+i);
		 }
		}
		for(int i=0;i<5;i++)
			System.out.println("Here "+Thread.currentThread().getName());//non-synchronized methods will run the same
	}
}
public class SynchronizedImplementation1{
	public static void main(String[] args) {
		Th a= new Th();
		Thread t1= new Thread(a,"saby");
		Thread t2= new Thread(a,"sonal");
		t1.start();
		t2.start();
	}
}