import java.io.*;

public class FileCreation1 {
		
		public void createfiles() throws IOException {
			File f = new File("E:\\Java Programs\\car\\filewrite1.txt");
			f.createNewFile();
			System.out.println(f.exists());
			
		}			
		public void filesdir() throws IOException{
			File f = new File("E:\\Java Programs\\car\\filewrite1.txt");
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getAbsoluteFile());
			System.out.println(f.getCanonicalPath());
			System.out.println(f.getCanonicalFile());
			System.out.println(f.getPath());
			
			
			
		}			
			
	     
		public static void main(String [] args ) {
			try{
			FileCreation1 a = new FileCreation1();
			 a.createfiles();
			a.filesdir();}
 			catch(IOException e){ System.out.println(e);}
			
			
		}


}