import java.lang.*;
import java.util.*;
import java.io.*;
public class ThreadImplementation3 implements Runnable{
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("Hey this is sarabjeetr herre");
				}
			}


		public static void main(String[] args) {
			ThreadImplementation3 b= new ThreadImplementation3();
			Thread a = new Thread(b);
			a.start();
			for(int i=0;i<10;i++){
				System.out.println("Hey this is  herre");
			}

		}
}