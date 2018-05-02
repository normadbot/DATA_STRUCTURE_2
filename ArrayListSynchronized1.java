import java.lang.*;
import java.util.*;
public class ArrayListSynchronized1{
	public static void main(String... args) {
		ArrayListSynchronized1 a= new ArrayListSynchronized1();
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("practice");
		list.add("Code");
		list.add("Geeks");

		synchronized(list){
				Iterator it = list.iterator();

				while(it.hasNext()){
					System.out.println(it.next());
				}
		}
	}
}