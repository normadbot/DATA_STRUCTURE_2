import java.util.*;
import java.lang.*;
import java.io.*;
class Employee1 implements Serializable {
	 String name;
	 String date;
	 int ID;
	
	Employee1(String ename,int id , String d) {
	this.name= ename;
	this.date= d;
	this.ID = id;		
	}
	
	private void writeObject(ObjectOutputStream stream)throws IOException{
		stream.writeObject(name);
		stream.writeObject(date);
		stream.writeObject(ID);
	}
	private void readObject(ObjectInputStream stream)throws IOException ,ClassNotFoundException,NumberFormatException	{
			name=(String)stream.readObject();
			date= (String)stream.readObject();
			ID= stream.readInt();
	}
	
}