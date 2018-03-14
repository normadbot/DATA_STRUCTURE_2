import java.lang.*;
import java.util.*;
import java.text.*;
public class NumberFormat2 {

			public static void main(String [] args ) {
				float f1 = 213.341233312f;
				NumberFormat nf = NumberFormat.getInstance();
				System.out.println(nf.getMaximumFractionDigits()+" ");
				System.out.println(nf.format(f1));
				nf.setMaximumFractionDigits(5);
				System.out.println(nf.format(f1)+" ");
				try{
					System.out.println(nf.parse("2133.412"));
					nf.setParseIntegerOnly(true);
					System.out.println(nf.parse("2133.412"));					
				}catch(ParseException pe ){
					System.out.println("parse exc");
				}
			
			}

}