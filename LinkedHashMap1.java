import java.lang.*;
import java.util.*;
public class LinkedHashMap1{
		public static void main(String[] args) {
			LinkedHashMap<Integer,String> al= new LinkedHashMap<Integer,String>();
			al.put(1,"saby");
			al.put(3,"King");
			al.put(4,"Kingoroot");
			al.put(5,"Maharaja");
			al.put(8,"Raani");
			al.put(6,"rakaa");
			for (Map.Entry s : al.entrySet()) {
				System.out.println(s.getKey()+" "+s.getValue());
			}
		}
}