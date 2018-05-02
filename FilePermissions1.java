import java.lang.*;
import java.io.*;
import java.util.*;
public class FilePermissions1{
		public static void main(String[] args) {
			File f= new File("sabyfile.txt");
			boolean exist= f.exists();
			if(exist){
				f.setExecutable(true);
				f.setReadable(true);
				f.setWritable(false);

				System.out.println("File Permissions Changed");
				System.out.println("executable: "+f.canExecute());
				System.out.println("Readable: "+f.canRead());
				System.out.println("Writable: "+f.canWrite());
			}else{
				System.out.println("File Not found");
			}
		}
}