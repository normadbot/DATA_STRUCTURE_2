import java.lang.*;
import java.io.*;
import java.util.*;
//import org.apache.commons.io.FileUtils;
public class FilesOfParticularExtensions1{
	public static void main(String[] args)throws Exception {
		String[] ext={".txt"};
		File f= new File("C:\\Program Files");
		printExtensionFiles(f,ext);
	}
	public static void printExtensionFiles(File f,String[] ext)throws Exception{
		File[] file = f.listFiles();
		for (File files : file) {
			if(files.isFile()){
				for (String e: ext) {
					boolean extension=files.toString().endsWith(e);
					if(extension){
						System.out.println("File :"+files.toString());	
					}
				}
				
			}
			if(files.isDirectory()){
				
				printExtensionFiles(files,ext);
			}
		}



	}
}