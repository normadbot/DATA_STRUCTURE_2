import java.io.*;

public class Filo {
 public static void main(String [] args ) throws Exception {
	boolean newfile =false;
	File file= new File("E:\\Java Programs\\car");
	System.out.println(file.exists());
	file.createNewFile();
	//System.out.println(newfile);
	System.out.println(file.exists());
 
 }


}