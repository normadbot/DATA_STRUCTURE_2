import java.io.*;

public class FileCreation6 {
		public FileCreation6() throws IOException
		{
		File file =new File("E:\\Java Programs\\car\\FileStream.txt");
		file.createNewFile();
		
		FileOutputStream fo = new FileOutputStream(file);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		String str = "Hi this is Sarabjeet singh here ";
		
		
		bo.write(str.getBytes());
		bo.flush();
		bo.close();
		
		FileInputStream fi = new FileInputStream(file);
		BufferedInputStream bi = new BufferedInputStream(fi);
		byte[] in = new byte[bi.available()];
	   int size = bi.read(in);
	   String a=new String(in);
		System.out.println(a);
		bi.close();
		
		
		
		
		
		}
		
		
		
		public static void main(String [] args ) throws IOException {
		FileCreation6 q = new FileCreation6();
		
		
		}


}