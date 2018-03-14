import java.util.*;

public class Dates2{
		public static void main(String [] args ) {
			Date d1 = new Date(2015,11,21);
			Date d2 = new Date();
			Date d3 = new Date(2017,5,01);
			
			boolean a = d1.before(d2);
			System.out.println("th date of d1 is after d2 ::"+a);
			
			boolean b = d3.after(d2);
			System.out.println("tHE DATE d3 is aftet d2 ::"+b);
			
			int c = d1.compareTo(d2);
			System.out.println(c);
			
			int s = d2.compareTo(d3);
			System.out.println(s);
		}
}