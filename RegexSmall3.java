import java.util.regex.*;
import java.lang.*;
public class RegexSmall3 {
		public static void main(String args []){
			Pattern p = Pattern.compile("[abc][zxv]");
			Matcher  m = p.matcher("abcveuysza");
			boolean b = false;
			while(b=m.find()) {
				System.out.print(m.start()+ " ");
				
				
			}
		
		
		

		}
}