import java.lang.*;
import java.util.*;
import java.text.*;

public class NumberFormat1 {
			public static void main(String [] args){
			float f= 123.1324f;
			Locale fr = new Locale("fr");
			NumberFormat [] nfa =new NumberFormat[4];
			nfa[0] = NumberFormat.getInstance();
			nfa[1] = NumberFormat.getInstance(fr);
			nfa[2] = NumberFormat.getCurrencyInstance();
			nfa[3] = NumberFormat.getCurrencyInstance(fr);
				for(NumberFormat n : nfa ){
					System.out.println(n.format(f));
					
				}
					
			}
}