import java.lang.*;
import java.util.*;
import java.io.*;
public class FileData2{
			public static void main(String [] args )throws IOException{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the 2 Student data You wanna Write in Your Text File");
				String n[] = new String[2];
				double []c= new double[2];
				String reg[] = new String[2];
				for(int i=0;i<2;i++){
					System.out.println("Enter name");
					n[i]=s.next();
					System.out.println("Enter CGPA");
					c[i]=s.nextFloat();
					System.out.println("Enter Reg");		
					reg[i]=s.next();
				}
				
				File file = new File("E:\\Java Programs\\car\\CMD_Data2.txt");
				file.createNewFile();
				FileOutputStream fw = new FileOutputStream(file);
				BufferedOutputStream fis = new BufferedOutputStream(fw);	
				for(int x=0;x<2;x++){
				fis.write((n[x]));
				fis.newLine();
				fis.write(Double.toString(c[x]));
				fis.newLine();
				fis.write(reg[x]);
				fis.newLine();
				}
				fis.flush();
				fis.close();
			}
}