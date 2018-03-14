import java.io.*;
import java.util.*;

class Mythread3 implements Runnable {
	@Override 
	public void run(){
		System.out.println("This is threads running ");
		for (int i=1; i<=3;i++){
			System.out.println("Run by: "+Thread.currentThread().getName()+" ");
		}
	}
}
public class Mythread4 {
	public static void main(String [] args  ) {
		Mythread3 a=new Mythread3();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		
		t1.setName("SABY");
		t2.setName("SONAL");
		t3.setName("PAHUL");//717 page in SCJP book // book mark
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t3.getId());
	}

}