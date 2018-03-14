import java.lang.*;
import java.util.*;
public class HashmapTest1{
		public static void main(String [] arhs){
			HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
			a.put(277,500);
			System.out.println(a.get(277));
			a.put(277,50+1);
			System.out.println(a.get(277));
			
		}
}