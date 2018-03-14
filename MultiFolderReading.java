import java.io.*;
import java.lang.*;

public class MultiFolderReading {

			public void checkNoOfFiles (String filename) throws Exception {
				File dir = new File(filename);
				File[] files = dir.listFiles();
				  
				if(files != null){
					for(int i=0;i<files.length;i++) {
						if(files[i].isFile()) {
							System.out.println("File::"+files[i].getName());
							System.out.println();
						} else if(files[i].isDirectory()) {
							System.out.println("Directory::"+files[i].getName());
							System.out.println();
							checkNoOfFiles(files[i].getAbsolutePath());
						}
					}
				}
			}

			public static void main(String[] args) throws Exception {
					MultiFolderReading mf=new MultiFolderReading();
					String str="E:\\"; 
					mf.checkNoOfFiles(str);
		   }
}