import java.util.*;

public class Dates1 {
			
			public static void main (String [] args ) {
				Date d1 = new Date(10000000000L);
				System.out.println("1st date "+d1.toString());
				d1.setTime(d1.getTime()+360000 );
				System.out.println("new time "+d1.toString());
			   Date now = new Date();
			   System.out.println(now);
			
			
			}



}