import java.lang.*;
import java.util.*;

public class Genric2 {
	public static void main(String [] args ) {
		List<String> l = new ArrayList<String>();
		l.add("Sabby");
		l.add("Romn");
		l.add("jazz");
		Iterator i = l.iterator();
		while(i.hasNext()){
			System.out.println("The names Are :"+i.next());
		}
	
	
	}
}