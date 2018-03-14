import java.lang.*;
import  java.util.*;
class FooRunnable implements Runnable {
public void run() {
for(int x = 1; x < 6; x++) {
System.out.println("Runnable running");
}
}
}
public class TestThreads {
public static void main (String [] args) {
FooRunnable r = new FooRunnable();
Thread t = new Thread(r);
t.start();
}
}
Starting a Thread (Exam Objective 4.1) 709