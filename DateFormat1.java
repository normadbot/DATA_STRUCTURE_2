import java.util.*;
import java.text.*;

public class DateFormat1{
		public  static void main(String [] args) {
			Date d = new Date();
			
			DateFormat [] dfa = new DateFormat[6];
			dfa[0] =DateFormat.getInstance();
			dfa[1]= DateFormat.getDateInstance(DateFormat.SHORT);
			dfa[2]=DateFormat.getDateInstance(DateFormat.MEDIUM);
			dfa[3]=DateFormat.getDateInstance(DateFormat.LONG);
			dfa[4]=DateFormat.getDateInstance(DateFormat.FULL);
			
			for (DateFormat df : dfa){
				System.out.println(df.format(d));
			}
		
		}
}