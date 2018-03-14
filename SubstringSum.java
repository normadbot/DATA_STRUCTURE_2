import java.lang.*;
import java.util.*;
public class SubstringSum{
		public static void main(String [] args ){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter The Number  ");	
				String str= s.next();
				int sum=0;
				for(int i=0;i<str.length();i++){
						for(int j=i+1;j<=str.length();j++){
							sum+=Integer.parseInt(str.substring(i,j));
								
						}
						
				}
				System.out.println(sum+" ");
		}
}