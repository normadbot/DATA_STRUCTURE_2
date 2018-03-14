import java.lang.*;
import java.util.*;
public class ThreadUse1{
		public static void main(String [] args ){
			Thread  thread = new Thread();
			System.out.println("thread main name is "+ thread.getName());
			thread.setName("kogent");
			System.out.println("thread main name is "+ thread.getName());
		}
}