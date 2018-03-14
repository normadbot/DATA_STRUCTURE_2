import java.io.*;

class Dog implements Serializable {
	int i= 10;
	int j= 20;

}
class Cat implements Serializable{
	int k = 22;
	int p= 56;	
	
}
class Rat implements Serializable{
	int o = 12;
	String s = "sabsba";
}

public class SerializableDemo {
	public static void main(String [] args ) throws Exception {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Rat r1 = new Rat();
		
		FileOutputStream fos = new FileOutputStream("SerializableDemo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);				//where we know the order of serialiazation we should deserialize it in the same order//
		oos.writeObject(r1);
		
		
		FileInputStream fis = new FileInputStream("SerializableDemo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		Cat c2 = (Cat)ois.readObject();
		Rat r2 = (Rat)ois.readObject();
		
	    System.out.println(d2.i+" "+d2.j+" "+c2.k+" "+c2.p+"  "+r2.o+" "+r2.s);
		
	}
	
}