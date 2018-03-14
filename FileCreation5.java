import java.io.*;

public class FileCreation5 {
		public FileCreation5() throws IOException
	{
		File dir= new File("E:\\Java Programs\\car\\FileCreation5");
		dir.mkdir();
		File file1 = new File(dir,"file1.txt");
	 
		BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
		bw.write("Name:Sarabjeet Singh \t");
		bw.write("Age:19 \t");
		bw.write("college:SRM University \t");
		bw.flush();
		bw.close();
		 
		BufferedReader bf = new BufferedReader(new FileReader(file1));
		String a;
		while((a=bf.readLine())!=null)
			System.out.print(a);
		bf.close();
		File bio = new File(dir,"bio.txt");
		file1.renameTo(bio);
		
		File dir2 = new File(dir,"Dir2");
		dir2.mkdir();
		
		
	}
		public static void main (String [] args ) throws IOException
		{
		
		FileCreation5 q = new FileCreation5();
		
		
		}


}