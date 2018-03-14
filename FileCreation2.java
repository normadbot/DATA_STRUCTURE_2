import java.io.*;

public class FileCreation2{
	public FileCreation2() throws IOException {
	   File f = new File("E:\\Java Programs\\car\\filewrite2.txt");
	   f.createNewFile();
	   f.list();
	   
	   FileWriter r = new FileWriter("E:\\Java Programs\\car\\filewrite2.txt");
	   r.write("This is sarabjeet singh from SRM");
	   r.flush();
	   r.close();
	   
	   char [] in =new char[40];
	  

	  FileReader s = new FileReader("E:\\Java Programs\\car\\filewrite2.txt");
		
	 int size =0;
      size = s.read(in);
		for (char e: in){
		System.out.print(e);
		}
	   
	   s.close();
		//f.delete();
		f.list();
		f.listFiles();
	}
		public static void main (String [] args ) throws IOException {
			FileCreation2 a = new FileCreation2();
			
			
		}
}