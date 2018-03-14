import java.lang.*;
import java.util.*;
import java.text.*;
public class Locale3 {
			public static void main(String [] args ) {
				
				Locale [] loc = new Locale[3];
				loc [0] =new Locale("hi","IN");
				loc [1] =new Locale("pt","BR");
				loc [2] =new Locale("da","DK");
					for (Locale l:loc ){
				Date d1 = new Date();
				d1.toString();
					System.out.println(l.getDisplayCountry()+" "+l.getDisplayLanguage());
						
					}
			
			
			}
}