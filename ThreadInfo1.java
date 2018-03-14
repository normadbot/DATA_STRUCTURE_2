import java.lang.*;
import java.util.*;
class ThreadInfo1 {
	public static void main(String args[]) {
		while(true){
			try{
				System.out.println("Local date and Time :"+new java.util.Date());
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			
		}

	}
}