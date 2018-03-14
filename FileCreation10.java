import java.io.*;

public class FileCreation10 {
		public FileCreation10() throws IOException {
			File file = new File("E:\\CODES\\binaysearch.txt");
			BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
			int size ; 
			byte [] in= new byte[bi.available()];
			while((size=bi.read(in))!=-1){
			String a= new String(in);
			System.out.print(a);
			}
			
		}
	
		public static void main(String [] args ) throws IOException {
					FileCreation10 a =new FileCreation10();	
		}


}