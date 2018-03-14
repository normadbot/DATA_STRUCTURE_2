import java.lang.*;
import java.util.*;
import java.io.*;
class Customer implements Serializable {
	String username = "Sarabjeet Singh";
	transient   String password = "HeroOftheKingdom";
	
	private void writeObject(ObjectOutputStream ostream)throws Exception{
		ostream.defaultWriteObject();
		String epassword = "123"+password;
		ostream.writeObject(epassword);
	}
	
	private void readObject(ObjectInputStream istream)throws Exception{
		istream.defaultReadObject();
		String epassword = (String)istream.readObject();
		String password= epassword.substring(3);
		
	}
	
}
public class CustomerImplementer {
		public static void main(String [] args )throws Exception {
			Customer a = new Customer();
			System.out.println(a.username+" "+a.password);
			
			FileOutputStream fos = new FileOutputStream("CustomerImplementer_1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			
			FileInputStream fis = new FileInputStream("CustomerImplementer_1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer b = (Customer)ois.readObject();
			
			System.out.println(b.username+" "+b.password);
			
		
			
		}

}