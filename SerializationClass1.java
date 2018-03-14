import java.io.*;
import java.lang.*;
import java.util.*;

class Message implements Serializable {
	public String name ="";
	public int  age = 0;
}

public class SerializationClass1 	{
			public static void main(String [] args ){			
			 try {	
				Message a =new Message();
				Scanner n = new Scanner(System.in);
				System.out.println("Input your name ");
				a.name = n.nextLine();
				System.out.println("Enter you Age ");
				a.age= n.nextInt();
				
				
				
						FileOutputStream fileOut = new FileOutputStream("SABY_First_Serialization_File.txt");
						ObjectOutputStream out = new ObjectOutputStream(fileOut);
						out.writeObject(a);
						out.close();
						fileOut.close();
						System.out.printf("Serialized data is saved in SABY_First_Serialization_File.txt file");
					} catch (IOException i) {
						i.printStackTrace();
					}
			}

}