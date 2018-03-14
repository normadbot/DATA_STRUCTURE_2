import java.util.regex.*;
import java.lang.*;
public class RegexSmall {
		public static void main(String [] args ){
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("abababababab     ");
		boolean b= false;
		while(b=m.find()){
			System.out.print(m.start()+" ");
			
		}
		}
}