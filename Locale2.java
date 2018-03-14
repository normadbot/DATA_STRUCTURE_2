import java.lang.*;
import java.util.*;
import java.text.*;
public class Locale2{
		public static void main(String [] args ) {			
				Locale [] loc = new Locale[4];
				loc[0] = new Locale("it","IT");
				loc[1] = new Locale("pt","BR");
				loc[2] = new  Locale("hi","IN");
				loc[3] = new Locale("ja","JA");
				
						for(Locale ds: loc){
								Calendar c = Calendar.getInstance();
								c.set(2016,11,14);
								Date d2 = c.getTime();
								DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,ds);
								String s = df.format(d2);
								System.out.println(s);
				}
		}
}
		