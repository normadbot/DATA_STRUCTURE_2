import java.util.*;
import java.text.*;
import java.lang.*;

public class Locale1 {
			public static void main(String [] args ) throws Exception {
				
				Date d= new Date();	
				DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
				String s = df.format(d);
				System.out.println(s);
				
			}
}




