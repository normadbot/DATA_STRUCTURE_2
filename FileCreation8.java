import java.io.*;

public class FileCreation8 {
			public FileCreation8() throws IOException {
			
			File file = new File("E:\\Java Programs\\car\\BufferReader");
			file.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("0123456789");
			bw.flush();
			bw.close();
			BufferedReader br =  new BufferedReader(new FileReader(file));
			String a;
			while((a=br.readLine())!=null)
				System.out.println(a);
			
			
			
			}
			
			public static void main(String [] args ) throws IOException {
			
			FileCreation8 a = new FileCreation8();
			
			}
			
			
			


}