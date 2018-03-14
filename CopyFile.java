import java.lang.*;
import java.io.*;
import java.util.*; 
public class CopyFile{
		public CopyFile()throws IOException{
			File file1 = new File("E:\\CODES\\singlylinkedlist.txt");
			File file2 = new File("E:\\CODES\\singlylinkedlist_COPIED.txt");
			file2.createNewFile();
			BufferedReader br = new BufferedReader(new FileReader(file1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
			
			String a;
			while((a=br.readLine())!=null)
				bw.write(a);
		
			bw.close();
			bw.flush();
			br.close();
			
			
		}
		public static void main(String [] args )throws IOException{
			CopyFile c = new CopyFile();
		}
} 