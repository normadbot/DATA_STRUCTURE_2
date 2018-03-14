import java.io.*;

public class FileCreation11 {
	
	      
		  
			public void FileCreation()  throws Exception {                          // DONE BY ME 
				
				
			File file = new File ("E:\\CODES\\binaysearch.txt");
			BufferedInputStream br = new BufferedInputStream(new FileInputStream(file));
			byte [] in = new byte[br.available()];
			int size = br.read(in);
			String a = new String(in);
			System.out.print(a);
			
			br.close();
			
			File file2 = new File("E:\\CODES\\COPIED_binarysearch.txt");
			file2.createNewFile();
			BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(file2));
			bw.write(a.getBytes());
			bw.flush();
			bw.close();
			
			
			}
			
			public void transferData() {                                        //DONE BY SIR
				File file = new File ("E:\\CODES\\binaysearch.txt");
				File file2 = new File("E:\\CODES\\COPIED_binarysearch.txt");
				byte [] in = new byte[512];		
				BufferedInputStream br = null;
				BufferedOutputStream bw = null;
						
				try {
					br = new BufferedInputStream(new FileInputStream(file));
					bw = new BufferedOutputStream(new FileOutputStream(file2));
						
					while(br.read(in) != -1){
						bw.write(in);
					}
						bw.flush();
				} catch(IOException io){
					io.printStackTrace();
				} finally{
					try {
						br.close();
						bw.close();
					} catch(IOException io){
						io.printStackTrace();
					}
				}
			}
			
			public static void main(String [] args ) throws Exception {
			     FileCreation11 a = new FileCreation11();
			      a.transferData();
			}


}