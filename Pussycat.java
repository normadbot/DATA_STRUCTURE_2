import java.io.*;
import java.util.*;

class Cat implements Serializable {
	String pussy ="This is Pussy Class ";
}
class Rat extends Cat {
  String  raty = "this is little rat class";
}
public class Pussycat {
	public static void main(String [] args )throws Exception {
		Rat r = new Rat();
		
		FileOutputStream fos = new FileOutputStream("Pussy_Cat_Inheritance_File.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(r);
		
		FileInputStream fis = new FileInputStream("Pussy_Cat_Inheritance_File.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Rat r2 = (Rat)ois.readObject();
		System.out.println(r2.pussy+ ".."+r2.raty);
		
	
	}

}