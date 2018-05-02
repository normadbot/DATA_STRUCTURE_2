import java.lang.*;
import java.util.*;
class DaemonThread extends Thread{

	public void run(){
		try{
		if(Thread.currentThread().isDaemon()){
			System.out.println("This is Daemon Thread");
		}else{
			System.out.println("This is User Thread");
		}
	}catch(Exception e){
			e.printStackTrace();
	}
	}
}
public class DaemonThreadImplementation1 {
	public static void main(String[] args) {
		try{	
			DaemonThread s1= new DaemonThread();
			DaemonThread s2=new DaemonThread();
			DaemonThread s3= new DaemonThread();

			s1.setDaemon(true);
			s1.start();
			s2.start();
			s3.start();

			s3.setDaemon(true);
		}catch(Exception e){
			e.printStackTrace();
		}				
	}
}