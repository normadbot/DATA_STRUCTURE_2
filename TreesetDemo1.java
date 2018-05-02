import java.lang.*;
import java.util.*;
public class TreesetDemo1{
		public static void main(String[] args) {
			ArrayList<Integer> a= new ArrayList<Integer>();
			a.add(45);
			a.add(40);
			a.add(58);
			a.add(5896);
			a.add(123);
			a.add(400);
			TreeSet t= new TreeSet(a);
			System.out.println(t);
		}
}