import java.util.regex.*;
import java.lang.*;

public class RegexSmall2 {
		public static void main(String [] args ){
		Pattern p = Pattern.compile("abc");
		Matcher m= p.matcher("aBcdefabccbAbC");
		boolean b = false;
		while(b=m.find()) {
			System.out.print("START : " + m.start() + " END : " + m.end() + "\n");	 
			
		}
		
		}

}