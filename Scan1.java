import java.lang.*;
import java.io.*;

public class Scan1 {
	
	
	public static void getFilesRecursive(File pFile)
{
    for(File files : pFile.listFiles())
    {
        if(files.isDirectory())
        {
            getFilesRecursive(files);
        }
        {
        else
            
        }
    }
}
		
	
	
		public static void main(String [] args ) throws IOException {
		File root = new File("ROOT PATH");
for ( File file : root.listFiles())
{
    getFilesRecursive(file);
}



		

}
}
