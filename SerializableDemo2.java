//unknown Serializable class
import java.io.*;
class Person1 implements Serializable {
	Person2 p2 = new Person2();
		
	String name1 = "Sarabjeet";
	int age1 = 19;
	void name(String n1){
	n1=name1;
	return n1;
	}
	void age(int a1){
	a1=age1;
	return a1;
	}
}
class Person2 implements Serializable{
  	Person3 p3 = new Person3();
	String name2 = "Sonal";
	int age2 = 23;
	void name(String n1){
	n1=name2;
	return n1;
	}
	void age(int a1){
	a1=age2;
	return a1;
	}
}

class Person3 implements Serializable{
	String name3 = "pahul";
	int age3 = 16;
	void name(String n1){
	n1=name1;
	return n1;
	}
	void age(int a1){
	a1=age3;
	return a1;
	}
}
public class SerializableDemo2 {
	public static void main(String [] arsg ) throws Exception {
		Person3 p3 = new Person3();
		
		
		FileOutputStream fos = new FileOutputStream("SerializableDemo2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p3);
		
		
	}

}