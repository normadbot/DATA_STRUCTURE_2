import java.io.*;

public class FileCreation9 {
			public FileCreation9() throws IOException {
				File file = new File("E:\\Java Programs\\car\\BufferedInputreader");
				file.createNewFile();
				BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(file));
				String str = "0123456789";
				bo.write(str.getBytes());
				bo.flush();
				bo.close();
				BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
				byte [] in = new byte[7];//byte [] in = new byte[bi.available);
				int size = bi.read(in);//int size= bi.read(in);
				String a = new String(in);//String a = new String (in);
				System.out.print(a);//S.O.P(a);
				bi.close();
			}
			
			
			
			public static void main(String [] args ) throws IOException {
					FileCreation9 a = new FileCreation9();
			
			}


}