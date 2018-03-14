import java.lang.*;
import java.util.*;
public class RaceConditionDemo extends Thread {
Counter c;
RaceConditionDemo(Counter c) { this.c = c; start(); }
public void run() {
for(int i=0;i<10000;i++) c.dcr();
}
public static void main(String args[]) throws Exception {
Counter c = new Counter();
RaceConditionDemo rc = new RaceConditionDemo(c);
for(int i=0;i<10000;i++) c.inc();
rc.join();
System.out.println("Final value of c.val: "+c.val);
}
}
class Counter {
int val = 0;
synchronized void inc() { 
synchronized(this){
val++; }}
 void dcr() { 
 synchronized(this){
 val--;} }
}