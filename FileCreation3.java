import java.io.*;

public class FileCreation3 {
		public FileCreation3() throws IOException {
			File f =new File("E:\\Java Programs\\car\\filewrite3.txt");
			f.createNewFile();
			f.exists();
			
			FileWriter w =new FileWriter(f);
			PrintWriter pw = new PrintWriter(w);
			pw.print("Hello");
			pw.print("World");
			pw.flush();
			pw.close();
			
			FileReader g = new FileReader(f);
			BufferedReader b = new BufferedReader(g);
			String data = b.readLine();
			System.out.println(data);
			
			

		}				


		public static void main(String [] args ) throws IOException {
			
			FileCreation3	a=new FileCreation3();
		
		
		}



}