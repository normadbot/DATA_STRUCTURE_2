import java.lang.*;
import java.util.*;
public class TreeMap1{
	static Map<String,Integer> map= new HashMap<>();

	public static void sortbyKey(){
		TreeMap<String,Integer> sorted = new TreeMap<>(map);
		for (Map.Entry<String,Integer> s : sorted.entrySet()) {
			System.out.println(s.getKey()+ " "+s.getValue());
		}
	}
	public static void main(String[] args) {
		map.put("Jayant",80);
		map.put("saby",50);
		map.put("Ritik",100);
		map.put("Katsoob",10);
		map.put("Jassi",30);
		map.put("Amit",80);
	//	for (Map.Entry<String,Integer> s : map.entrySet()) {
	//		System.out.println(s.getKey()+ " "+s.getValue());
	//	}
		sortbyKey();
	}
}