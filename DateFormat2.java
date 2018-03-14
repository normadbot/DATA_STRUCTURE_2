import java.util.*;
import java.io.*;

public class DateFormat2 {  
		public static void main(String []   args) {
			Date d =  new Date();
			System.out.println("d = "+d.toString());
			
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
			String s = df.format(d);
			System.out.println(d);
					try{
						Date d2 = df.parse(s);
						System.out.println("parsed"+d2.toString());
						
					}catch(ParseException pe){
					System.out.println("parse exc");
					}
			
		}


}