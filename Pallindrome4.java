import java.lang.*;
import java.util.*;
import java.io.*;
public class Pallindrome4{
		public static void main(String [] args)throws IOException{
			Scanner s = new Scanner(System.in);
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size of the pallindrome");
			int n = s.nextInt();
			System.out.println("Enter the pallindrome");
			char [] ch= new char[n];
			int i=0;
			do{
				ch[i]=(char)bf.read();
				i++;
			}while(i<n);
			int j=0,flag=0;
			do{
				if(ch[j]!=ch[n-j-1]){
					flag=1;
				}
				j++;
			}while(j<=n-1);
			if(flag!=1)
				System.out.println("Yes It is pallindrome");	
			
			else
					System.out.println("Not a pallindrome");
			
		}
}