import java.lang.*;
import java.util.*;
import java.io.*;

public class DeserializationClass1 {
	public static void main(String [] args ) {
			Message a = null;
		try{
			FileInputStream fileIn = new FileInputStream("SABY_First_Serialization_File.txt");
			ObjectInputStream  objIn = new ObjectInputStream(fileIn);
			a=(Message) objIn.readObject();
			objIn.close();
			fileIn.close();
		}catch(IOException  i ){
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return;
		}
		System.out.println("Deserializing SerializationClass1...");
		System.out.println(" Name : " + a.name);
		System.out.println("age: " + a.age);
		
	}
}