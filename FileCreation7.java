import java.io.*;

public class FileCreation7 {
		public FileCreation7 () throws IOException{
			File dir = new File("E:\\Java Programs\\car\\Directory1");
			dir.mkdir();
			File file1 = new File(dir,"file1");
			file1.createNewFile();
			File file2 = new File(dir,"file2");
			file2.createNewFile();
				
			
			
			
		}
		
		
		public static void main(String [] args ) throws IOException {
			FileCreation7 a = new FileCreation7();
			
			if(dir.isDirectory()){
				String [] dirContent=dir.list();
					for (int i=0;i<dirContent.length;i++){
						System.out.println(dirContent[i]);
					}
				
			}
		
		
		}

}