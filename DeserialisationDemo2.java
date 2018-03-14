//Deserialisation when we do not know the order of serialised data //
import java.io.*;
public class DeserialisationDemo2 {
		public static void main(String [] args ) throws Exception {
			
			 FileInputStream fis = new FileInputStream("SerializableDemo2.txt");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 Object O = ois.readObject();
			 Object [] s = {new Person1(), new Person2() , new Person3()};
			 
			 for(Object d : s){
				 if(O instanceof s){
					 s m1 =(s)O;
						m1.name();
						m1.age();
				 }
			 }
						
			
		
		}
}