import java.io.*;
import java.util.*;
import java.lang.*;
public class FileWriteReadCommonString{
	public static void main(String [] args)throws IOException{
			FileWriter f1=new FileWriter("E:\\Java Programs\\car\\s11.txt");
			FileWriter f2=new FileWriter("E:\\Java Programs\\car\\s22.txt");
			FileWriter f3=new FileWriter("E:\\Java Programs\\car\\s33.txt");
			f1.write("Hello Student i am Sarabjeet");
			f2.write("Student are a precious gems");
			f3.write("The Student has to work hard in Acadmics");
			f1.flush();
			f2.flush();
			f3.flush();
			f1.close();
			f2.close();
			f3.close();
	}
}
