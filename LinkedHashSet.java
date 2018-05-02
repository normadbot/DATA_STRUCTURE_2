import java.lang.*;
import java.util.*;
public class LinkedHashSet{
	public static void main(String[] args) {
		LinkedHashSet<String> al= new LinkedHashSet<String>();
		al.add("Sabyy");
		al.add("kingo");
		al.add("rajaa");
		al.add("auysh");
		al.add("Sabjio");

		for (LinkedHashSet<String> a: al) {
			System.out.println(a);
		}
	}
}