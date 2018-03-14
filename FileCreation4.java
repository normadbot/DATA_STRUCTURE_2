import java.io.*;
import java.util.*;


public class FileCreation4 {
	   
	   public FileCreation4() throws IOException 
		{
		File mydir = new File("E:\\Java Programs\\car\\filewrite4");
		mydir.mkdir();
		File myfile = new File(mydir,"myfile.txt");
		myfile.createNewFile();
		
		FileWriter fw = new FileWriter(myfile);
		fw.write("This is Myfile inside the mydir Directory ");
		fw.flush();
		fw.close();
		
		 
		BufferedReader br = new BufferedReader(new FileReader(myfile));
		String s;
		while((s=br.readLine())!=null)
			    System.out.println(s);
			br.close();
		
		File newname = new File(mydir,"newname.txt");	
		myfile.renameTo(newname);
	
		
		}
		public static void main(String [] args ) throws IOException {
					
					FileCreation4 a = new FileCreation4();
					FileWriter2 th = new FileWriter2();
					Thread one = new Thread(th);
					one.start();
		
		}


}


class FileWriter2 implements Runnable {
	public void run()  {
	try {	
		File mydir = new File("E:\\Java Programs\\car\\filewrite4.1");
		mydir.mkdir();
		File myfile = new File(mydir,"myfile.txt");
		myfile.createNewFile();
		FileWriter fw = new FileWriter(myfile);
		fw.write("This is Myfile inside the mydir Directory using  Thread ");
		fw.flush();
		fw.close();
		BufferedReader br = new BufferedReader(new FileReader(myfile));
		String s;
		while((s=br.readLine())!=null)
			    System.out.println(s);
			br.close();
		
		File newname = new File(mydir,"newname.txt");	
		myfile.renameTo(newname);
	}catch(IOException e){
		System.out.println("Error found");
	}
		
	}
	
	
}
