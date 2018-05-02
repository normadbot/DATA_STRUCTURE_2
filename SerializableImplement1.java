import java.lang.*;
import java.util.*;
import java.io.*;
class Cat  implements Serializable{
	void display(){
		System.out.println("Hello this is sarabjeet");
	}
}
public class SerializableImplement1{
		public static void main(String[] args)throws Exception {
			Cat c= new Cat();
			FileOutputStream fs = new FileOutputStream("Ser.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			os.close();

			FileInputStream fi = new FileInputStream("Ser.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			c=(Cat)oi.readObject();
			oi.close();

		}	
}