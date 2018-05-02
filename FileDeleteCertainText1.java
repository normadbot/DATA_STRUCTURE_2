import java.lang.*;
import java.io.*;
import java.util.*;
public class FileDeleteCertainText1{
		public static void main(String[] args)throws Exception {
			File f1= new File("sabyfile.txt");
			File f2 = new File("Deletesaby.txt");
			File f3 = new File("sabyAfter_delete.txt");
			BufferedReader rsaby = new BufferedReader(new FileReader(f1));
			BufferedReader rsabydelete = new BufferedReader(new FileReader(f2));
			PrintWriter sabynew= new PrintWriter(new FileWriter(f3));
			HashSet<String> hs = new HashSet<String>();
			String line;
			while((line=rsabydelete.readLine())!=null){
				hs.add(line);
			}
			String fileline;
			while((fileline=rsaby.readLine())!=null){
					if(!hs.contains(fileline)){
						sabynew.println(fileline);
					}
			}
			sabynew.flush();
			sabynew.close();
			rsaby.close();
			rsabydelete.close();
			
		}
}