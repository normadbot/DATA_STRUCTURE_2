import java.lang.*;
import java.util.*; 

public class MyThread11 extends Thread {
int count = 0;
public int getCount() { return count; }
public void run() {
while(true) count++;
}
}
 class PriorityTest {
public static void main(String args[]) throws InterruptedException {
MyThread11 t1 = new MyThread11();
MyThread11 t2 = new MyThread11();
//t1.setPriority(Thread.MAX_PRIORITY);
//t2.setPriority(Thread.MIN_PRIORITY);
t2.join();
	t2.start();
t1.start();
Thread.sleep(100);
System.out.println("Thread 1 count: "+t1.getCount());
System.out.println("Thread 2 count: "+t2.getCount());
}
}